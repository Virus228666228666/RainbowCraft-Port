package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockRainbowStairs extends BlockStairs {
    public BlockRainbowStairs(String name, IBlockState modelState) {
        super(modelState);
        this.setHardness(2.0F);
        this.setResistance(3.0F);
        this.setLightOpacity(255);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
}
