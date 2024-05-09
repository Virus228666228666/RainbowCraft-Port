package ru.V5Minecraft.RainbowCraft.world;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import ru.V5Minecraft.RainbowCraft.Register.RegisterBlocks;

import java.util.Random;

public class WorldGenRainbowTree extends WorldGenerator {
   private final int minTreeHeight;
   private final boolean vinesGrow;
   private final int metaWood;
   private final int metaLeaves;

   public WorldGenRainbowTree(boolean par1) {
      this(par1, 5, 0, 0, false);
   }

   public WorldGenRainbowTree(boolean par1, int par2, int par3, int par4, boolean par5) {
      this.minTreeHeight = par2;
      this.metaWood = par3;
      this.metaLeaves = par4;
      this.vinesGrow = par5;
   }

   @Override
   public boolean generate(World world, Random rand, BlockPos pos) {
      int l = rand.nextInt(3) + this.minTreeHeight;
      boolean flag = true;
      BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();

      if (pos.getY() >= 1 && pos.getY() + l + 1 <= 256) {
         for (int i1 = pos.getY(); i1 <= pos.getY() + 1 + l; ++i1) {
            int k1 = 1;
            if (i1 == pos.getY()) {
               k1 = 0;
            }

            if (i1 >= pos.getY() + 1 + l - 2) {
               k1 = 2;
            }

            for (int l1 = pos.getX() - k1; l1 <= pos.getX() + k1 && flag; ++l1) {
               for (int i2 = pos.getZ() - k1; i2 <= pos.getZ() + k1 && flag; ++i2) {
                  if (i1 >= 0 && i1 < 256) {
                     if (!this.isReplaceable(world, mutable.setPos(l1, i1, i2))) {
                        flag = false;
                     }
                  } else {
                     flag = false;
                  }
               }
            }
         }

         if (!flag) {
            return false;
         } else {
            Block block = world.getBlockState(pos.down()).getBlock();
            boolean isSoil = block.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, (BlockSapling) Blocks.SAPLING);
            if (isSoil && pos.getY() < 256 - l - 1) {
               block.onPlantGrow(world.getBlockState(pos.down()), world, pos.down(), pos);

               for (int j1 = pos.getY() - 3 + l; j1 <= pos.getY() + l; ++j1) {
                  int k2 = j1 - (pos.getY() + l);
                  int l2 = 1 - k2 / 2;

                  for (int i3 = pos.getX() - l2; i3 <= pos.getX() + l2; ++i3) {
                     int j3 = i3 - pos.getX();

                     for (int k3 = pos.getZ() - l2; k3 <= pos.getZ() + l2; ++k3) {
                        int l3 = k3 - pos.getZ();

                        if (Math.abs(j3) != l2 || Math.abs(l3) != l2 || rand.nextInt(2) != 0 && k2 != 0) {
                           BlockPos blockpos = new BlockPos(i3, j1, k3);
                           if (this.isReplaceable(world, blockpos)) {
                              this.setBlockAndNotifyAdequately(world, blockpos, RegisterBlocks.BlockRainbowLeaves.getDefaultState());
                           }
                        }
                     }
                  }
               }

               for (int j2 = 0; j2 < l; ++j2) {
                  BlockPos upN = pos.up(j2);
                  if (this.isReplaceable(world, upN)) {
                     this.setBlockAndNotifyAdequately(world, upN, RegisterBlocks.BlockRainbowLog.getDefaultState());
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean isReplaceable(World world, BlockPos pos) {
      Block block = world.getBlockState(pos).getBlock();
      return block.isAir(world.getBlockState(pos), world, pos) || block.isLeaves(world.getBlockState(pos), world, pos) || block == Blocks.GRASS || block == Blocks.DIRT || block instanceof BlockLog || block instanceof BlockLeaves;
   }

   public void generate(World world, Random random, int yCoord2, int zCoord2, int zCoord1) {

   }
}
