package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRainbowPlanks extends Block {
    public BlockRainbowPlanks(String name) {
        super(Material.WOOD);
        super.blockHardness = 2.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
}
