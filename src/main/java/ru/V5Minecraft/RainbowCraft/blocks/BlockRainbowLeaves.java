package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;
import javax.annotation.Nonnull;
import java.util.List;

public class BlockRainbowLeaves extends Block implements IShearable {
   public BlockRainbowLeaves(String name) {
      super(Material.ROCK);
      this.setTickRandomly(true);
      this.setHardness(0.2F);
      this.setLightOpacity(1);
      this.setRegistryName(name);
      this.setUnlocalizedName(name);
      this.setCreativeTab(null);
   }

   @Override
   public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
      return true;
   }

   @Nonnull
   @Override
   public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
      return NonNullList.withSize(1, new ItemStack(this));
   }

   @Override
   public BlockRenderLayer getBlockLayer()
   {
      return BlockRenderLayer.TRANSLUCENT;
   }

   @Override
   public boolean isOpaqueCube(IBlockState state)
   {
      return false;
   }
}
