package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ru.V5Minecraft.RainbowCraft.world.WorldGenRainbow;

import java.util.Random;

public class BlockRainbowSpawner extends BlockSapling {
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
      new WorldGenRainbow().generate(world, rand, x, y, z);
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
