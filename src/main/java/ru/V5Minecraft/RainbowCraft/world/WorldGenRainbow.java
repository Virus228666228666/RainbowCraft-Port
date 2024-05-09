package ru.V5Minecraft.RainbowCraft.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRainbow extends WorldGenerator {
   public boolean generate(World world, Random random, BlockPos blockPos) {
      int x = blockPos.getX();
      int y = blockPos.getY();
      int z = blockPos.getZ();
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
      return true;
   }

   public boolean generate(World world, Random random, int xCoord2, int yCoord2, int zCoord2) {
      world.setBlockState(new BlockPos(xCoord2, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 9, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 12, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 12, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 12, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 10, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 11, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 12, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 13, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 + 11, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 1, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 2, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));
      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 3, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 4, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(10));

      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));

      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 6, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(3));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 5, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(11));

      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 7, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(5));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(4));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 + 8, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 9, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(1));

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 + 10, zCoord2), Block.getBlockFromName("minecraft:stained_glass").getStateFromMeta(14));

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 - 1, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 - 1, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 - 1, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 - 2, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 8, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 1, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 2, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 3, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 4, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 5, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 6, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 - 1, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 7, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 1, zCoord2 + 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 1, zCoord2 - 2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 14, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 23, yCoord2 - 1, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 23, yCoord2 - 1, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 23, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 24, yCoord2 - 1, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 15, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 23, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 2, zCoord2 - 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 2, zCoord2 + 1), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());

      world.setBlockState(new BlockPos(xCoord2 + 16, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 17, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 18, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 19, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 20, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 21, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      world.setBlockState(new BlockPos(xCoord2 + 22, yCoord2 - 2, zCoord2), Block.getBlockFromName("rainbowcraft:cloud").getDefaultState());
      return true;
   }
}
