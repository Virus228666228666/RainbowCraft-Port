package ru.V5Minecraft.RainbowCraft.Proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.RainbowCraft.Register.*;
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
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
