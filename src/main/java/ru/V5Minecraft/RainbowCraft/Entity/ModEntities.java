package ru.V5Minecraft.RainbowCraft.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

@Mod.EventBusSubscriber
public class ModEntities {
   private static int entityId = 0;

   @SubscribeEvent
   public static void onRegisterEntities(RegistryEvent.Register<EntityEntry> event) {
      event.getRegistry().registerAll(
              createEntityEntry(EntityLeprechaun.class, "leprechaun", 65280, 16711680)
      );
   }

   public static void load() {
      createEntityEntry(EntityLeprechaun.class, "leprechaun", 65280, 16711680);
   }

   private static EntityEntry createEntityEntry(Class<? extends Entity> entityClass, String name, int solidColor, int spotColor) {
      ResourceLocation resourceLocation = new ResourceLocation("rainbowcraft", name);
      return EntityEntryBuilder.create()
              .entity(entityClass)
              .id(resourceLocation, entityId++)
              .name(name)
              .egg(solidColor, spotColor)
              .tracker(64, 1, true)
              .build();
   }
}
