package com.chefmooon.breezebounce.common.block;

import com.chefmooon.breezebounce.common.registry.ModParticleTypes;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Half;

import java.util.function.BiConsumer;

public class BreezeBounceStairBlock extends StairBlock implements SimpleBreezeBounceBlock, SimpleWaterloggedBlock {

    public static final MapCodec<BreezeBounceStairBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(BlockState.CODEC.fieldOf("base_state").forGetter((stairBlock) -> {
            return stairBlock.baseState;
        }), propertiesCodec()).apply(instance, BreezeBounceStairBlock::new);
    });
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    @Override
    public MapCodec<? extends BreezeBounceStairBlock> codec() {
        return CODEC;
    }

    public BreezeBounceStairBlock(BlockState blockState, Properties properties) {
        super(blockState, properties);
        this.registerDefaultState(this.defaultBlockState().setValue(POWERED, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(POWERED);
    }

    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float f) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, blockState, blockPos, entity, f);
        } else {
            entity.causeFallDamage(f, 0.0F, level.damageSources().fall());
        }
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(blockGetter, entity);
        } else {
            BlockPos blockPos = entity.getBlockPosBelowThatAffectsMyMovement().above();
            if (blockGetter.getBlockState(blockPos).getBlock() instanceof BreezeBounceStairBlock) {
                if (blockGetter.getBlockState(blockPos).getValue(HALF) == Half.BOTTOM) {
                    this.bounceUp(entity, blockGetter.getBlockState(blockPos).getValue(POWERED), TERMINAL_VELOCITY);
                }
            } else if (blockGetter.getBlockState(blockPos.below()).getBlock() instanceof BreezeBounceStairBlock) {
                this.bounceUp(entity, blockGetter.getBlockState(blockPos.below()).getValue(POWERED), TERMINAL_VELOCITY);
            }

        }
    }

    @Override
    public float getJumpFactor() {
        return this.jumpFactor + 0.5f;
    }

    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !(Boolean)blockState.getValue(POWERED)) {
            this.inflate(this, blockState, level, blockPos, (Player) null);
        }
        super.onExplosionHit(blockState, level, blockPos, explosion, biConsumer);
    }

    @Override
    protected void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if ((Boolean)blockState.getValue(POWERED)) {
            checkPower(this, blockState, serverLevel, blockPos);
        }
    }

    @Override
    public void spawnParticles(Level level, BlockPos blockPos) {
        double d = 0.5625;
        RandomSource randomSource = level.random;
        Direction[] directions = Direction.values();

        // TODO improve these particles, use this blockState
        BlockState blockState = level.getBlockState(blockPos);

        for (Direction direction : directions) {
            BlockPos blockPos2 = blockPos.relative(direction);
            if (!level.getBlockState(blockPos2).isSolidRender(level, blockPos2)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5 + d * (double) direction.getStepX() : (double) randomSource.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5 + d * (double) direction.getStepY() : (double) randomSource.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5 + d * (double) direction.getStepZ() : (double) randomSource.nextFloat();
                level.addParticle(ModParticleTypes.BOUNCE_WHITE.get(), (double) blockPos.getX() + e, (double) blockPos.getY() + f, (double) blockPos.getZ() + g, 0.0, 0.0, 0.0);
            }
        }
    }
}
