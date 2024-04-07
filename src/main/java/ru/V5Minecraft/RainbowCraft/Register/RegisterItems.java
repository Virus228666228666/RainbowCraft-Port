package ru.V5Minecraft.RainbowCraft.Register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.V5Minecraft.RainbowCraft.items.*;

public class RegisterItems {
    public static Item ItemRainbowSword = new ItemRainbowSword();
    public static Item ItemRainbowAxe = new ItemRainbowAxe();
    public static Item ItemRainbowHoe = new ItemRainbowHoe();
    public static Item ItemRainbowPickaxe = new ItemRainbowPickaxe();
    public static Item ItemRainbowShovel = new ItemRainbowShovel();
    public static Item ItemRainbowDiamond = new ItemRainbowDiamond();
    public static Item ItemRainbowStick = new ItemRainbowStick();
    public static Item shards = new ItemRainbowShards();
    public static Item seeds = new ItemRainbowSeeds(RegisterBlocks.crops, Blocks.FARMLAND);
    public static Item rainbowBoots = new ItemRainbowArmor("rainbowBoots", 1, EntityEquipmentSlot.FEET);
    public static Item rainbowLegs = new ItemRainbowArmor("rainbowLegs", 2, EntityEquipmentSlot.LEGS);
    public static Item rainbowChestplate = new ItemRainbowArmor("rainbowChestplate", 1, EntityEquipmentSlot.CHEST);
    public static Item rainbowHelmet = new ItemRainbowArmor("rainbowHelmet", 1, EntityEquipmentSlot.HEAD);

    public static void register() {
        setRegister(ItemRainbowSword);
        setRegister(ItemRainbowAxe);
        setRegister(ItemRainbowHoe);
        setRegister(ItemRainbowPickaxe);
        setRegister(ItemRainbowShovel);
        setRegister(ItemRainbowDiamond);
        setRegister(ItemRainbowStick);
        setRegister(shards);
        setRegister(seeds);
        setRegister(rainbowBoots);
        setRegister(rainbowLegs);
        setRegister(rainbowChestplate);
        setRegister(rainbowHelmet);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(ItemRainbowSword);
        setRender(ItemRainbowAxe);
        setRender(ItemRainbowHoe);
        setRender(ItemRainbowPickaxe);
        setRender(ItemRainbowShovel);
        setRender(ItemRainbowDiamond);
        setRender(ItemRainbowStick);
        setRender(shards);
        setRender(seeds);
        setRender(rainbowBoots);
        setRender(rainbowLegs);
        setRender(rainbowChestplate);
        setRender(rainbowHelmet);
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.registerAll(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
