package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.item.ItemAxe;

public class ItemRainbowAxe extends ItemAxe {
    public ItemRainbowAxe() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName("rainbowAxe");
        this.setRegistryName("rainbowAxe");
        this.canRepair = true;
        this.setCreativeTab(null);
    }
}
