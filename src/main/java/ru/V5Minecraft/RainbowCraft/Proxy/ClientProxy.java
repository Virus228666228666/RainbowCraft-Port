package ru.V5Minecraft.RainbowCraft.Proxy;

import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.V5Minecraft.RainbowCraft.RainbowCraft;
import ru.V5Minecraft.RainbowCraft.Register.*;
import ru.V5Minecraft.RainbowCraft.TileEntity.RainbowFurnaceTileEntity;
import ru.V5Minecraft.RainbowCraft.gui.MainMenuHandler;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        MinecraftForge.EVENT_BUS.register(new MainMenuHandler());
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RegisterBlocks.registerRender();
        GameRegistry.registerTileEntity(RainbowFurnaceTileEntity.class, new ResourceLocation("rainbowcraft", "rainbowfurnacetileentity"));
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
