package com.chefmooon.breezebounce.common.block.neoforge;

import com.chefmooon.breezebounce.common.block.BreezeBounceStairBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class BreezeBounceStairBlockImpl extends BreezeBounceStairBlock {
    public BreezeBounceStairBlockImpl(BlockState blockState, Properties properties) {
        super(blockState, properties);
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return FLAMMABILITY;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return FIRE_SPREAD;
    }
}
