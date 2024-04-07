package ru.V5Minecraft.RainbowCraft.Register;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.V5Minecraft.RainbowCraft.blocks.*;

public class RegisterBlocks {
    public static Block BlockRainbow = new BlockRainbow("rainbow");
    public static Block BlockCloud = new BlockCloud("cloud");
    public static Block BlockRainbowLog = new BlockRainbowLog("rainbowLog");
    public static Block BlockRainbowPlanks = new BlockRainbowPlanks("rainbowPlanks");
    public static Block BlockRainbowStairs = new BlockRainbowStairs("rainbowStair", BlockRainbowPlanks.getDefaultState());
    public static Block BlockRainbowSpawner = new BlockRainbowSpawner("rainbowSpawner");
    public static Block BlockRainbowLeaves = new BlockRainbowLeaves("rainbowLeaves");
    public static Block crops = new BlockRainbowCrops().setUnlocalizedName("rainbowCrops").setRegistryName("rainbowCrops");
    public static Block BlockRainbowSapling = new BlockRainbowSapling("rainbowSapling");
    public static Block BlockRainbowCraftingTable = new BlockRainbowCraftingTable("rainbowTable");
    public static Block BlockRainbowCobblestone = new BlockRainbowCobblestone("rainbowCobblestone");
    public static Block BlockRainbowHouse = new BlockRainbowHouse("rainbowHouse");

    public static void register() {
        setRegister(BlockRainbow);
        setRegister(BlockCloud);
        setRegister(BlockRainbowLog);
        setRegister(BlockRainbowPlanks);
        setRegister(BlockRainbowStairs);
        setRegister(BlockRainbowSpawner);
        setRegister(BlockRainbowLeaves);
        setRegister(crops);
        setRegister(BlockRainbowSapling);
        setRegister(BlockRainbowCraftingTable);
        setRegister(BlockRainbowCobblestone);
        setRegister(BlockRainbowHouse);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(BlockRainbow);
        setRender(BlockCloud);
        setRender(BlockRainbowLog);
        setRender(BlockRainbowPlanks);
        setRender(BlockRainbowStairs);
        setRender(BlockRainbowSpawner);
        setRender(BlockRainbowLeaves);
        setRender(crops);
        setRender(BlockRainbowSapling);
        setRender(BlockRainbowCraftingTable);
        setRender(BlockRainbowCobblestone);
        setRender(BlockRainbowHouse);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
