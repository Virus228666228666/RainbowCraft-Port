package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.item.ItemPickaxe;

public class ItemRainbowPickaxe extends ItemPickaxe {
    public ItemRainbowPickaxe() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName("rainbowPickaxe");
        this.setRegistryName("rainbowPickaxe");
        this.canRepair = true;
        this.setCreativeTab(null);
    }
}
