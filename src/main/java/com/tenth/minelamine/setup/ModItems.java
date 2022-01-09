package com.tenth.minelamine.setup;

import com.tenth.minelamine.setup.Items.ScissorBlade;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Stream;

public class ModItems {
    public static CreativeModeTab MLMItems = new CreativeModeTab("mlmitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCISSOR_BLADE.get());
        }
    };

    public static final Tier LIFE_FIBER_TIER = new Tier() {
        @Override
        public int getUses() {
            return 0;
        }

        @Override
        public float getSpeed() {
            return 10;
        }

        @Override
        public float getAttackDamageBonus() {
            return 0;
        }

        @Override
        public int getLevel() {
            return 10;
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };
    public static final RegistryObject<Item> LIFE_FIBER = Register.ITEMS.register(
            "life_fiber", ()-> new Item(new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_INGOT = Register.ITEMS.register(
            "life_fiber_ingot", ()-> new Item(new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> SCISSOR_BLADE = Register.ITEMS.register(
            "scissor_blade", ()-> new ScissorBlade(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_SWORD = Register.ITEMS.register(
            "life_fiber_sword", ()-> new SwordItem(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_PICKAXE = Register.ITEMS.register(
            "life_fiber_pickaxe", ()-> new PickaxeItem(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_AXE = Register.ITEMS.register(
            "life_fiber_axe", ()-> new AxeItem(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_SHOVEL = Register.ITEMS.register(
            "life_fiber_shovel", ()-> new ShovelItem(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
    public static final RegistryObject<Item> LIFE_FIBER_HOE = Register.ITEMS.register(
            "life_fiber_hoe", ()-> new HoeItem(LIFE_FIBER_TIER, 4, 4, new Item.Properties().tab(MLMItems)));
}
