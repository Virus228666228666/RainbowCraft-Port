package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRainbowSapling extends BlockSapling {
   public BlockRainbowSapling(String name) {
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
      world.setBlockState(new BlockPos(x, y, z), Block.getBlockFromName("rainbowcraft:rainbowlog").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 1, z), Block.getBlockFromName("rainbowcraft:rainbowlog").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 2, z), Block.getBlockFromName("rainbowcraft:rainbowlog").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 3, z), Block.getBlockFromName("rainbowcraft:rainbowlog").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 1, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 2, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 2, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 2, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 1, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 2, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 2, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 2, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 2, z - 0), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 2, y + 1, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 1, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 1, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 0, y + 1, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 2, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 0, y + 2, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 2, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 2, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 2, z - 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 2, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 2, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 2, y + 2, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 2, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 0, y + 2, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x - 1, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 0, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x, y + 4, z), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 3, z), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 3, z), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x, y + 3, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 3, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x, y + 4, z - 1), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 4, z), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
      world.setBlockState(new BlockPos(x - 1, y + 4, z), Block.getBlockFromName("rainbowcraft:rainbowleaves").getDefaultState());
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
