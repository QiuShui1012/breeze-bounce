package com.chefmooon.breezebounce.common.block;

import com.chefmooon.breezebounce.common.registry.ModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BreezeBounceWallBlock extends BreezeBounceBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    protected static final float AABB_MIN = 6.0F;
    protected static final float AABB_MAX = 10.0F;
    protected static final VoxelShape Y_AXIS_AABB = box(6.0d, 0d, 6.0d, 10.0d, 16.0d, 10.0d);
    protected static final VoxelShape Z_AXIS_AABB = box(6.0d, 6.0d, 0.0d, 10.0d, 10.0d, 16.0d);
    protected static final VoxelShape X_AXIS_AABB = box(0.0d, 6.0d, 6.0d, 16.0d, 10.0d, 10.0d);

    protected static final VoxelShape Y_AXIS_AABB_COLLISION = box(4.75d, 0d, 4.75d, 11.25d, 16.0d, 11.25d);
    protected static final VoxelShape Z_AXIS_AABB_COLLISION = box(4.75d, 4.75d, 0.0d, 11.25d, 11.25d, 16.0d);
    protected static final VoxelShape X_AXIS_AABB_COLLISION = box(0.0d, 4.75d, 4.75d, 16.0d, 11.25d, 11.25d);

    public BreezeBounceWallBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(POWERED, false).setValue(WATERLOGGED, Boolean.FALSE).setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED, AXIS);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluid = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState().setValue(WATERLOGGED, fluid.getType() == Fluids.WATER).setValue(AXIS, context.getClickedFace().getAxis());
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return state;
    }

    @Override
    protected VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        switch (blockState.getValue(AXIS)) {
            case X:
            default:
                return X_AXIS_AABB;
            case Z:
                return Z_AXIS_AABB;
            case Y:
                return Y_AXIS_AABB;
        }
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        switch (blockState.getValue(AXIS)) {
            case X:
            default:
                return X_AXIS_AABB_COLLISION;
            case Z:
                return Z_AXIS_AABB_COLLISION;
            case Y:
                return Y_AXIS_AABB_COLLISION;
        }
    }

    @Override
    public void spawnParticles(Level level, BlockPos blockPos) {
        double d = 0.0625;
        RandomSource randomSource = level.random;
        Direction[] directions = Direction.values();

        for (Direction direction : directions) {
            Direction.Axis axis = direction.getAxis();
            double e = axis == Direction.Axis.X ? 0.5 + d * (double) direction.getStepX() : (double) randomSource.nextFloat();
            double f = axis == Direction.Axis.Y ? 0.5 + d * (double) direction.getStepY() : (double) randomSource.nextFloat();
            double g = axis == Direction.Axis.Z ? 0.5 + d * (double) direction.getStepZ() : (double) randomSource.nextFloat();
            level.addParticle(ModParticleTypes.BOUNCE_WHITE.get(), (double) blockPos.getX() + e, (double) blockPos.getY() + f, (double) blockPos.getZ() + g, 0.0, 0.0, 0.0);
        }
    }

    protected BlockState rotate(BlockState blockState, Rotation rotation) {
        return rotatePost(blockState, rotation);
    }

    public static BlockState rotatePost(BlockState blockState, Rotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)blockState.getValue(AXIS)) {
                    case X -> {
                        return (BlockState)blockState.setValue(AXIS, Direction.Axis.Z);
                    }
                    case Z -> {
                        return (BlockState)blockState.setValue(AXIS, Direction.Axis.X);
                    }
                    default -> {
                        return blockState;
                    }
                }
            default:
                return blockState;
        }
    }
}
