package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRainbow extends Block {
    public BlockRainbow(String name) {
        super(Material.ROCK);
        super.blockHardness = 2.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
}
