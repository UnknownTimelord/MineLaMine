package com.tenth.minelamine.setup;

import com.tenth.minelamine.setup.Blocks.LifeFiberBlock;
import com.tenth.minelamine.setup.Blocks.LifeFiberBlockEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    void ModBlocks(){

    }
    public static CreativeModeTab MLMBlocks = new CreativeModeTab("mlmblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(LIFE_FIBER_BLOCK.get());
        }
    };
    public static final RegistryObject<Block> LIFE_FIBER_BLOCK = Register.BLOCKS.register(
            "life_fiber_block", ()-> new LifeFiberBlock(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)));
    public static final RegistryObject<Item> LIFE_FIBER_BLOCKITEM = Register.ITEMS.register(
            "life_fiber_block", ()-> new BlockItem(LIFE_FIBER_BLOCK.get(), new Item.Properties().tab(MLMBlocks)));
    public static final RegistryObject<BlockEntityType<LifeFiberBlockEntity>> LIFE_FIBER_BLOCKENTITY = Register.BLOCK_ENTITIES.register(
            "life_fiber_block", ()-> BlockEntityType.Builder.of(LifeFiberBlockEntity::new, LIFE_FIBER_BLOCK.get()).build(null));
}
