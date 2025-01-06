package ru.V5Minecraft.RainbowCraft.gui;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MainMenuHandler {
   public static ResourceLocation menuPic = new ResourceLocation("rainbowcraft:textures/gui/mainmenu.png");
   public static final String[] mcTitle = new String[]{"minecraftTitleTextures", "field_110352_y"};

   @SubscribeEvent
   public void openMainMenu(GuiOpenEvent event) {
      if (event.getGui() instanceof GuiMainMenu) {
         GuiMainMenu menu = (GuiMainMenu) event.getGui();
         RCReflectionHelper.setPrivateFinalValue(GuiMainMenu.class, menu, menuPic, mcTitle);
      }
   }
}
