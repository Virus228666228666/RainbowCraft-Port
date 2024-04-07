package ru.V5Minecraft.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockRainbowFurnace extends Block {
   public BlockRainbowFurnace(String name) {
      super(Material.ROCK);
      this.setCreativeTab(null);
      this.setUnlocalizedName(name);
      this.setRegistryName(name);
      super.blockHardness = 3.5F;
   }

   public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
      if (worldIn.isRemote)
         return true;
      playerIn.displayGui(new InterfaceFurnace(worldIn, pos));
      playerIn.addStat(StatList.FURNACE_INTERACTION);
      return true;
   }

   public static class InterfaceFurnace implements IInteractionObject {
      private final World world;

      private final BlockPos position;

      public InterfaceFurnace(World worldIn, BlockPos pos) {
         this.world = worldIn;
         this.position = pos;
      }

      public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
         return (Container) new InterfaceFurnace.BlockRainbowFurnaceContainer(playerInventory, this.world, this.position);
      }

      public String getGuiID() {
         return "minecraft:furnace";
      }

      @Override
      public String getName() {
         return "furnace";
      }

      @Override
      public boolean hasCustomName() {
         return false;
      }

      @Override
      public ITextComponent getDisplayName() {
         return (ITextComponent) new TextComponentTranslation(Blocks.FURNACE.getUnlocalizedName() + ".name", new Object[0]);
      }

      public static class BlockRainbowFurnaceContainer extends ContainerFurnace {
         private final World world;

         private final BlockPos pos;

         public BlockRainbowFurnaceContainer(InventoryPlayer playerInventory, World world, BlockPos pos) {
            super(playerInventory, (TileEntityFurnace) world.getTileEntity(pos));
            this.world = world;
            this.pos = pos;
         }

         public boolean canInteractWith(EntityPlayer playerIn) {
            if (!(this.world.getBlockState(this.pos).getBlock() instanceof BlockRainbowFurnace))
               return false;
            return (playerIn.getDistanceSq(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) <= 64.0D);
         }
      }
   }
}
