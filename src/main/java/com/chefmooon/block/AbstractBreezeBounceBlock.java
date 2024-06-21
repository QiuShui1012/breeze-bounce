package com.chefmooon.block;

import com.chefmooon.BreezeBounce;
import com.chefmooon.registry.ModSoundsRegistry;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;


public class AbstractBreezeBounceBlock extends Block {
    public static final MapCodec<AbstractBreezeBounceBlock> CODEC = simpleCodec(AbstractBreezeBounceBlock::new);
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    private static final int ticksToStayPowered = 80;
    private static final int DOUBLE_JUMP_SPREAD = 1;
    private static final double DOUBLE_JUMP_ACTIVATION_THRESHOLD = 2.4;
    private static final double TERMINAL_VELOCITY = 1.0;

    public MapCodec<? extends AbstractBreezeBounceBlock> codec() {
        return CODEC;
    }

    public AbstractBreezeBounceBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(POWERED, false));
    }

    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float f) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, blockState, blockPos, entity, f);
        } else {
            entity.causeFallDamage(f, 0.0F, level.damageSources().fall());
        }
        // todo - bug - double jump, need to change implementation?
        //if (f > DOUBLE_JUMP_ACTIVATION_THRESHOLD) tryDoubleJumpSpread(level, blockState, blockPos, entity);
    }

    private void tryDoubleJumpSpread(Level level, BlockState blockState, BlockPos blockPos, Entity entity) {
        if (entity.isSuppressingBounce()) {
            for (BlockPos.MutableBlockPos mutableBlockPos : getSpreadPosMutable(blockPos)) {
                this.activateDoubleBounce(level, mutableBlockPos.immutable());
            }
        }
    }

    public Iterable<BlockPos.MutableBlockPos> getSpreadPosMutable(BlockPos blockPos) {
        return BlockPos.spiralAround(blockPos, DOUBLE_JUMP_SPREAD, Direction.NORTH, Direction.EAST);
    }

    private void activateDoubleBounce(Level level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.getBlock() instanceof AbstractBreezeBounceBlock) {
            this.inflate(blockState, level, blockPos, (Player) null);
        }
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(blockGetter, entity);
        } else {
            BlockPos blockPos = entity.getBlockPosBelowThatAffectsMyMovement();
            this.bounceUp(entity, blockGetter.getBlockState(blockPos).getValue(POWERED));
        }
    }
    private void bounceUp(Entity entity, Boolean powered) {
        double VERTICAL_TERMINAL_VELOCITY = TERMINAL_VELOCITY * 1.2;
        Vec3 vec3 = entity.getDeltaMovement();
        if (vec3.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.0 : 0.8;
            if (powered) d *= 1.5;
            if (powered) VERTICAL_TERMINAL_VELOCITY *= 1.1;
            if (Math.abs(vec3.y * d) < VERTICAL_TERMINAL_VELOCITY) {
                entity.setDeltaMovement(vec3.x, -vec3.y * d, vec3.z);
            } else {
                entity.setDeltaMovement(vec3.x, VERTICAL_TERMINAL_VELOCITY, vec3.z);
            }

            if (vec3.y < -0.08) {
                this.playBounceSound(entity, (float) vec3.y);
            }
        }
    }

    public void updateEntityAfterFlyUp(Level level, BlockState blockState, BlockPos blockPos, Entity entity, Vec3 vec3) {
        double VALID_HEAD_BOUNCE_THRESHOLD = 0.082;
        boolean powered = blockState.getValue(POWERED);
        if (vec3.y > VALID_HEAD_BOUNCE_THRESHOLD) {
            if (!entity.isSuppressingBounce()) {
                this.bounceDown(entity, powered, vec3);
            }
            this.playBounceSound(entity, level, blockPos, (float) vec3.y);
        }
    }

    private void bounceDown(Entity entity, Boolean powered, Vec3 vec3) {
        double VERTICAL_TERMINAL_VELOCITY = TERMINAL_VELOCITY;
        double d = entity instanceof LivingEntity ? 1.5 : 0.8;
        if (powered) d *= 2;
        if (powered) VERTICAL_TERMINAL_VELOCITY *= 1.2;
        if (Math.abs(vec3.y * d) < VERTICAL_TERMINAL_VELOCITY) {
            if (vec3.y < 0.01) d *= 100;
            entity.setDeltaMovement(vec3.x, -vec3.y * d, vec3.z);
        } else {
            entity.setDeltaMovement(vec3.x, -VERTICAL_TERMINAL_VELOCITY, vec3.z);
        }
    }

    public void updateEntityAfterSideCollision(Level level, BlockState blockState, BlockPos blockPos, Entity entity, Vec3 vec3) {
        boolean powered = blockState.getValue(POWERED);
        if (!entity.isSuppressingBounce()) {
            this.bounceHorizontal(level, blockPos, entity, vec3, powered);
        }
    }

    private void bounceHorizontal(Level level, BlockPos blockPos, Entity entity, Vec3 vec3, Boolean powered) {
        double HORIZONTAL_TERMINAL_VELOCITY = TERMINAL_VELOCITY;
        double VALID_BOUNCE_THRESHOLD = 0.1;
        double d = entity instanceof LivingEntity ? 1.5 : 0.8;
        if (powered) d *= 2;
        if (powered) HORIZONTAL_TERMINAL_VELOCITY *= 2;
        Vec3 reverseVector = getBounceDirection(vec3);
        if (Math.abs(vec3.z) > VALID_BOUNCE_THRESHOLD || Math.abs(vec3.x) > VALID_BOUNCE_THRESHOLD) {
            if (Math.abs(vec3.z * d) < HORIZONTAL_TERMINAL_VELOCITY && Math.abs(vec3.x * d) < HORIZONTAL_TERMINAL_VELOCITY) {
                entity.setDeltaMovement(reverseVector.x * d, reverseVector.y, reverseVector.z * d);
            } else {
                entity.setDeltaMovement(reverseVector.x, reverseVector.y, reverseVector.z);
            }
            this.playBounceSound(entity, level, blockPos, (float) reverseVector.length());
        }
    }

    private Vec3 getBounceDirection(Vec3 vec3) {
        double VALID_BOUNCE_THRESHOLD = 0.1;
        double x = vec3.x;
        double z = vec3.z;
        Vec3 bounceVector = vec3;

        Pair<Direction, Float> xVector = getDirectionVector(x, Direction.WEST, Direction.EAST, VALID_BOUNCE_THRESHOLD);
        Pair<Direction, Float> zVector = getDirectionVector(z, Direction.NORTH, Direction.SOUTH, VALID_BOUNCE_THRESHOLD);

        Pair<Direction, Float> majorVector = Math.abs(xVector.getSecond()) > Math.abs(zVector.getSecond()) ? xVector : zVector;
        Direction majorDirection = majorVector.getFirst();

        if (majorDirection == Direction.NORTH || majorDirection == Direction.SOUTH) { // Major vector z
            bounceVector = new Vec3(bounceVector.x, bounceVector.y, -bounceVector.z);
        } else if (majorDirection == Direction.EAST || majorDirection == Direction.WEST) { // Major vector x
            bounceVector = new Vec3(-bounceVector.x, bounceVector.y, bounceVector.z);
        }

        return bounceVector;
    }

    private Pair<Direction, Float> getDirectionVector(double d, Direction positiveDirection, Direction negativeDirection, double threshold) {
        if (d > threshold) {
            return Pair.of(positiveDirection, (float) d);
        } else if (d < -threshold) {
            return Pair.of(negativeDirection, (float) d);
        }
        return Pair.of(Direction.UP, 0.0f);
    }

    @Override
    public float getJumpFactor() {
        return this.jumpFactor + 0.5f;
    }

    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !(Boolean)blockState.getValue(POWERED)) {
            this.inflate(blockState, level, blockPos, (Player) null);
        }
        super.onExplosionHit(blockState, level, blockPos, explosion, biConsumer);
    }

    public void inflate(BlockState blockState, Level level, BlockPos blockPos, @Nullable Player player) {
        level.setBlock(blockPos, (BlockState)blockState.setValue(POWERED, true), 3);
        level.updateNeighborsAt(blockPos, this);
        level.scheduleTick(blockPos, this, getPoweredTime());
        this.playSound((Player) null, level, blockPos, true);
        level.gameEvent(player, GameEvent.BLOCK_ACTIVATE, blockPos);
    }

    protected int getPoweredTime() {
        return ticksToStayPowered;
    }

    @Override
    protected void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if ((Boolean)blockState.getValue(POWERED)) {
            checkPower(blockState, serverLevel, blockPos);
        }
    }

    protected void checkPower(BlockState blockState, Level level, BlockPos blockPos) {
        if ((Boolean)blockState.getValue(POWERED)) {
            level.setBlock(blockPos, (BlockState)blockState.setValue(POWERED, false), 3);
            level.updateNeighborsAt(blockPos, this);
            this.playSound((Player)null, level, blockPos, false);
            level.gameEvent((Player)null, GameEvent.BLOCK_DEACTIVATE, blockPos);
        }
    }

    protected void playBounceSound(Entity entity, float y) {
        if (entity instanceof Player) {
            entity.playSound(this.getBounceSound(), getVolume(y), getPitch(y));
        }
    }

    protected void playBounceSound(Entity entity, LevelAccessor levelAccessor, BlockPos blockPos, float y) {
        if (entity instanceof Player player) {
            levelAccessor.playSound(player, blockPos, this.getBounceSound(), SoundSource.BLOCKS, getVolume(y), getPitch(y));
        } else {
            levelAccessor.playSound((Player) null, blockPos, this.getBounceSound(), SoundSource.BLOCKS);
        }
    }

    protected void playSound(@Nullable Player player, LevelAccessor levelAccessor, BlockPos blockPos, boolean bl) {
        levelAccessor.playSound(bl ? player : null, blockPos, this.getSound(bl), SoundSource.BLOCKS);
    }

    protected float getVolume(float y) {
        return Math.clamp(1.0f + (Math.abs(y) * 0.3f), 1.0f, 1.8f);
    }

    protected float getPitch(float y) {
        return Math.clamp(0.2f + (Math.abs(y) * 0.4f), 0.2f, 1.1f);
    }

    public static SoundEvent getBounceSound() {
        return ModSoundsRegistry.BOUNCE_BLOCK_BOUNCE;
    }

    protected SoundEvent getSound(boolean bl) {
        return bl ? ModSoundsRegistry.BOUNCE_BLOCK_INFLATE : ModSoundsRegistry.BOUNCE_BLOCK_DEFLATE;
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        if ((Boolean)blockState.getValue(POWERED)) {
            this.spawnParticles(level, blockPos);
        }
    }

    public void spawnParticles(Level level, BlockPos blockPos) {
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }
}
