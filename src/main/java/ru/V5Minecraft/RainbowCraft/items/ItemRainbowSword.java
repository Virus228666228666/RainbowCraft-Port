package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.item.ItemSword;

public class ItemRainbowSword extends ItemSword {
    public ItemRainbowSword() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName("rainbowSword");
        this.setRegistryName("rainbowSword");
        this.canRepair = true;
        this.setCreativeTab(null);
    }
}
