package com.tenth.minelamine.setup.Blocks;

import net.minecraft.world.level.block.Block;


public class LifeFiberBlock extends Block {
    public LifeFiberBlock(Properties properties) {
        super(properties);
    }
/*
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(fabric_state);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(fabric_state, 0);
    }
 */
}
