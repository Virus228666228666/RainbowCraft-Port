package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.item.ItemSpade;

public class ItemRainbowShovel extends ItemSpade {
    public ItemRainbowShovel() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName("rainbowShovel");
        this.setRegistryName("rainbowShovel");
        this.canRepair = true;
        this.setCreativeTab(null);
    }
}
