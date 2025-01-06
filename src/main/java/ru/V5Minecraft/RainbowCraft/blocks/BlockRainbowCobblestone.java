package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRainbowCobblestone extends Block {
    public BlockRainbowCobblestone(String name) {
        super(Material.ROCK);
        this.setHardness(5.0F);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
}
