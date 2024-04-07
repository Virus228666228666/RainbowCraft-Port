package ru.V5Minecraft.RainbowCraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.RainbowCraft.CreativeTab.TabRainbowCraft;
import ru.V5Minecraft.RainbowCraft.Proxy.CommonProxy;

@Mod(modid = "rainbowcraft", name = "RainbowCraft", version = "1.8")
public class RainbowCraft {
    public static final TabRainbowCraft tabRainbowCraft = new TabRainbowCraft("tabRainbowCraft");

    @SidedProxy(clientSide = "ru.V5Minecraft.RainbowCraft.Proxy.ClientProxy", serverSide = "ru.V5Minecraft.RainbowCraft.Proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
