package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.item.ItemHoe;

public class ItemRainbowHoe extends ItemHoe {
    public ItemRainbowHoe() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName("rainbowHoe");
        this.setRegistryName("rainbowHoe");
        this.canRepair = true;
        this.setCreativeTab(null);
    }
}
