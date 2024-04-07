package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.V5Minecraft.RainbowCraft.RainbowCraft;

public class BlockRainbowLog extends Block {
    public BlockRainbowLog(String name) {
        super(Material.WOOD);
        super.blockHardness = 2.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(RainbowCraft.tabRainbowCraft);
    }
}
