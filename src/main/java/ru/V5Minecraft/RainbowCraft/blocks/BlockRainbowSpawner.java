package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRainbowSpawner extends BlockBush implements IGrowable {
   public BlockRainbowSpawner(String name) {
      this.setUnlocalizedName(name);
      this.setRegistryName(name);
      this.setCreativeTab(null);
   }

   @Override
   public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
      return true;
   }

   @Override
   public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
      return false;
   }

   @Override
   public void grow(World world, Random rand, BlockPos pos, IBlockState state) {
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      world.setBlockState(new BlockPos(x, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 1, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 1, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 1, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 2, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 2, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 2, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 3, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 3, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 3, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 4, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 4, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 4, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 5, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 5, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 5, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 6, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 6, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 6, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 1, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 1, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 2, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 2, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 3, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 3, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 4, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 4, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 5, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 5, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 6, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 6, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 7, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 7, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 2, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 2, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 3, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 3, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 4, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 4, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 5, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 5, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 6, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 6, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 7, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 7, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 8, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 9, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 8, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 9, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 8, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 9, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 8, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 9, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 8, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 9, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 8, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 9, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 8, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 9, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 7, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 6, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 7, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 6, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 7, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 6, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 7, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 6, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 5, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 5, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 5, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 4, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 4, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 3, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 10, y + 12, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 11, y + 12, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 12, y + 12, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 10, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 11, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 12, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 10, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 11, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 12, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 10, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 11, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 12, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 10, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 11, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 12, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 10, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 11, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 12, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 10, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 11, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 12, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 13, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 14, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 13, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 14, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 13, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 14, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 13, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 14, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 13, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 14, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 13, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 14, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 13, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 14, y + 11, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 22, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 22, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 22, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 21, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 21, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 21, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 20, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 20, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 20, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 19, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 19, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 19, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 18, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 18, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 18, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 17, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 17, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 17, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 16, y, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 16, y + 1, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 16, y + 2, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 21, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 21, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 20, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 20, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 19, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 19, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 18, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 18, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 17, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 17, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 16, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(x + 16, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 15, y + 3, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 15, y + 4, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 20, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 20, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 19, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 19, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 18, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 18, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 17, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 17, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 16, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 16, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(x + 15, y + 6, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(x + 15, y + 5, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(x + 19, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 18, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 17, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 16, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(x + 15, y + 7, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(x + 16, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(x + 15, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(x + 17, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 18, y + 8, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 17, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 16, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(x + 15, y + 9, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(x + 16, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 15, y + 10, z), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 7, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 7, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 1, z + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 1, z - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 15, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 15, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 15, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 14, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 23, y - 1, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 23, y - 1, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 23, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 24, y - 1, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 15, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 23, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 2, z - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 2, z + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(x + 16, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 17, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 18, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 19, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 20, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 21, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(x + 22, y - 2, z), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
   }

   @Override
   public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
      Random rand = new Random();
      if (!worldIn.isRemote) {
         if (playerIn.getHeldItem(hand).getItem() == Items.DYE && playerIn.getHeldItem(hand).getMetadata() == 15) {
            if (Math.random() * 100.0D <= 25.0D) {
               if (!playerIn.capabilities.isCreativeMode) {
                  playerIn.getHeldItem(hand).shrink(1);
               }
               this.grow(worldIn, rand, pos, state);
               return true;
            }
         }
      }
      return false;
   }
}
