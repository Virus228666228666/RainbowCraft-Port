package ru.V5Minecraft.RainbowCraft.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import ru.V5Minecraft.RainbowCraft.Register.RegisterBlocks;
import ru.V5Minecraft.RainbowCraft.Register.RegisterItems;

public class TabRainbowCraft extends CreativeTabs {
    public TabRainbowCraft(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(RegisterBlocks.BlockRainbowSpawner);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        items.clear();

        items.add(new ItemStack(RegisterBlocks.BlockRainbowSpawner));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowSapling));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowHouse));

        items.add(new ItemStack(RegisterBlocks.BlockRainbow));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowLog));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowPlanks));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowStairs));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowLeaves));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowCraftingTable));
        items.add(new ItemStack(RegisterBlocks.BlockRainbowCobblestone));
        items.add(new ItemStack(RegisterBlocks.BlockCloud));

        items.add(new ItemStack(RegisterItems.ItemRainbowSword));
        items.add(new ItemStack(RegisterItems.ItemRainbowAxe));
        items.add(new ItemStack(RegisterItems.ItemRainbowHoe));
        items.add(new ItemStack(RegisterItems.ItemRainbowPickaxe));
        items.add(new ItemStack(RegisterItems.ItemRainbowShovel));

        items.add(new ItemStack(RegisterItems.ItemRainbowDiamond));
        items.add(new ItemStack(RegisterItems.ItemRainbowStick));
        items.add(new ItemStack(RegisterItems.shards));
        items.add(new ItemStack(RegisterItems.seeds));

        items.add(new ItemStack(RegisterItems.rainbowHelmet));
        items.add(new ItemStack(RegisterItems.rainbowChestplate));
        items.add(new ItemStack(RegisterItems.rainbowLegs));
        items.add(new ItemStack(RegisterItems.rainbowBoots));

        items.add(new ItemStack(RegisterBlocks.BlockRainbowFurnace));

        super.displayAllRelevantItems(items);
    }
}
