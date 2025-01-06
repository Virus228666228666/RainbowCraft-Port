package ru.V5Minecraft.RainbowCraft.Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.RainbowCraft.Register.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        RegisterBlocks.register();
        RegisterItems.register();
    }

    public void init(FMLInitializationEvent event) {
        RegisterItems.registerRender();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
