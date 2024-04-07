package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCloud extends Block {
    public BlockCloud(String name) {
        super(Material.CLOTH);
        super.blockHardness = 0.1F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
}
