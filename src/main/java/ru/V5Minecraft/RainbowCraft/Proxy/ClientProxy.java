package ru.V5Minecraft.RainbowCraft.Proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.V5Minecraft.RainbowCraft.Entity.EntityLeprechaun;
import ru.V5Minecraft.RainbowCraft.Entity.ModEntities;
import ru.V5Minecraft.RainbowCraft.Register.*;
import ru.V5Minecraft.RainbowCraft.Render.RenderLeprechaun;
import ru.V5Minecraft.RainbowCraft.TileEntity.RainbowFurnaceTileEntity;
import ru.V5Minecraft.RainbowCraft.gui.MainMenuHandler;
import ru.V5Minecraft.RainbowCraft.world.RainbowCraftWorldGenerator;

public class ClientProxy extends CommonProxy {
    RainbowCraftWorldGenerator worldGen = new RainbowCraftWorldGenerator();

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        MinecraftForge.EVENT_BUS.register(new MainMenuHandler());
        ModEntities.load();
        RenderingRegistry.registerEntityRenderingHandler(EntityLeprechaun.class, renderManager ->
                new RenderLeprechaun(renderManager, new ModelBiped(), 0.5F)
        );
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RegisterBlocks.registerRender();
        GameRegistry.registerTileEntity(RainbowFurnaceTileEntity.class, new ResourceLocation("rainbowcraft", "rainbowfurnacetileentity"));
        GameRegistry.registerWorldGenerator(this.worldGen, 0);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
