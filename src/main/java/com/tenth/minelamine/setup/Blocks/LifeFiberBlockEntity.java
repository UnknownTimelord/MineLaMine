package com.tenth.minelamine.setup.Blocks;

import com.tenth.minelamine.setup.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LifeFiberBlockEntity extends BlockEntity {
    public LifeFiberBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.LIFE_FIBER_BLOCKENTITY.get(), pos, state);
    }
}
