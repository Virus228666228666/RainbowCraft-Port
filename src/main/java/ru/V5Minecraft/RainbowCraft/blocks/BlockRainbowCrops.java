package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import ru.V5Minecraft.RainbowCraft.Register.RegisterItems;

public class BlockRainbowCrops extends BlockCrops {
   protected Item func_149866_i() {
      return RegisterItems.seeds;
   }

   protected Item func_149865_P() {
      return RegisterItems.shards;
   }
}
