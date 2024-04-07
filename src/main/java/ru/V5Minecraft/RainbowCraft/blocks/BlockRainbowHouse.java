package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRainbowHouse extends Block {
   public BlockRainbowHouse(String name) {
      super(Material.WOOD);
      this.setUnlocalizedName(name);
      this.setRegistryName(name);
      this.setCreativeTab(null);
   }

   public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 0, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 1, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 1, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 1, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 1, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 1, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 1, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 1, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 1, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 0, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 2, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 2, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 2, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 2, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 1, z + 5), Blocks.OAK_DOOR.getDefaultState());
      IBlockState topDoorState = Blocks.OAK_DOOR.getDefaultState().withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.UPPER);

      world.setBlockState(new BlockPos(x + 1, y + 2, z + 5), topDoorState);

      world.setBlockState(new BlockPos(x + 0, y + 2, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 4, z + 3), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 4, z + 2), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 0, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 2, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 4, z + 3), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 4, z + 2), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 8, y + 2, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 2, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 2, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 4, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 7, y + 4, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 3, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 2, z + 5), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 2, z + 2), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 0, y + 2, z + 3), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 2), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 0, y + 3, z + 3), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 8, y + 2, z + 2), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 8, y + 2, z + 3), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 2), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));
      world.setBlockState(new BlockPos(x + 8, y + 3, z + 3), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(14));

      world.setBlockState(new BlockPos(x + 1, y + 2, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 2, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 2, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 2, z + 0), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 3, y + 2, z + 0), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 5, y + 2, z + 0), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 6, y + 2, z + 0), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 1, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 3, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 4, y + 2, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 5, y + 2, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 6, y + 2, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 4, y + 3, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 5, y + 3, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));
      world.setBlockState(new BlockPos(x + 6, y + 3, z + 5), Block.getBlockFromName("minecraft:stained_glass_pane").getStateFromMeta(10));

      world.setBlockState(new BlockPos(x + 1, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 4, z + 0), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 4, z + 1), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 1, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 2, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 5, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 4, z + 4), Block.getBlockFromName("rainbowcraft:rainbowplanks").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 0), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 5), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 1), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 4), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 7, z + 2), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 7, z + 3), Block.getBlockFromName("rainbowcraft:rainbowcobblestone").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 5, z + 6), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 5), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 7, z + 4), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 1, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 2, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 3, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 4, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 5, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 6, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 7, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());
      world.setBlockState(new BlockPos(x + 8, y + 8, z + 3), Block.getBlockFromName("rainbowcraft:rainbowstair").getDefaultState());

      world.setBlockState(new BlockPos(x + 0, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 1, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 2, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 3, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 4, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 5, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 6, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 7, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 8, y + 8, z + 2), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));

      world.setBlockState(new BlockPos(x + 0, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 1, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 2, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 3, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 4, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 5, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 6, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 7, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 8, y + 7, z + 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));

      world.setBlockState(new BlockPos(x + 0, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 1, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 2, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 3, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 4, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 5, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 6, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 7, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 8, y + 6, z + 0), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));

      world.setBlockState(new BlockPos(x + 0, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 1, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 2, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 3, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 4, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 5, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 6, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 7, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      world.setBlockState(new BlockPos(x + 8, y + 5, z - 1), Block.getBlockFromName("rainbowcraft:rainbowstair").getStateFromMeta(2));
      return true;
   }
}
