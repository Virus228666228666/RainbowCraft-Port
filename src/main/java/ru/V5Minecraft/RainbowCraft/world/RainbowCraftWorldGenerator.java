package ru.V5Minecraft.RainbowCraft.world;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.ChunkGeneratorHell;
import net.minecraft.world.gen.ChunkGeneratorOverworld;

public class RainbowCraftWorldGenerator implements IWorldGenerator {
   @Override
   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
      chunkX <<= 4;
      chunkZ <<= 4;
      if (chunkGenerator instanceof ChunkGeneratorOverworld) {
         generateSurface(world, random, chunkX, chunkZ, chunkGenerator);
      } else if (chunkGenerator instanceof ChunkGeneratorHell) {
         generateNether(world, random, chunkX, chunkZ);
      } else if (chunkGenerator instanceof ChunkGeneratorEnd) {
         generateEnd(world, random, chunkX, chunkZ);
      }
   }

   public static void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
   }

   public static void generateNether(World world, Random rand, int chunkX, int chunkZ) {
   }

   public static void generateSurface(World world, Random random, int chunkX, int chunkZ, IChunkGenerator chunkGenerator) {
      int xCoord2;
      int yCoord2;
      int zCoord2;
      for(xCoord2 = 0; xCoord2 < 10; ++xCoord2) {
         yCoord2 = chunkX + random.nextInt(16);
         zCoord2 = random.nextInt(100);
         int zCoord1 = chunkZ + random.nextInt(16);
         (new WorldGenRainbowTree(false, 5, 0, 0, false)).generate(world, random, yCoord2, zCoord2, zCoord1);
      }

      if (random.nextInt(10) == 2 && random.nextInt(10) == 2 && random.nextInt(10) == 2) {
         xCoord2 = chunkX + random.nextInt(16);
         yCoord2 = random.nextInt(100);
         zCoord2 = chunkZ + random.nextInt(16);
         if (yCoord2 <= 70) {
            yCoord2 = 70;
         }

         (new WorldGenRainbow()).generate(world, random, xCoord2, yCoord2, zCoord2);
      }
   }
}
