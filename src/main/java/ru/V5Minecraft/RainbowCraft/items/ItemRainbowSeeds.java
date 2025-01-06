package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemRainbowSeeds extends ItemSeeds {
    public ItemRainbowSeeds(Block crop, Block farmland) {
        super(crop, farmland);
        this.setUnlocalizedName("rainbowSeeds");
        this.setRegistryName("rainbowSeeds");
        this.setCreativeTab(null);
    }
}
