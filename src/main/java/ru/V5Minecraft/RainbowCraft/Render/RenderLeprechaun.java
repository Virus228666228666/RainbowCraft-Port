package ru.V5Minecraft.RainbowCraft.Render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import ru.V5Minecraft.RainbowCraft.Entity.EntityLeprechaun;

public class RenderLeprechaun extends RenderBiped<EntityLeprechaun> {
   private static final ResourceLocation LEPRECHAUN_TEXTURE = new ResourceLocation("rainbowcraft:textures/entity/leprechaun.png");

   public RenderLeprechaun(RenderManager renderManager, ModelBiped model, float shadowSize) {
      super(renderManager, model, shadowSize);
   }

   @Override
   protected ResourceLocation getEntityTexture(EntityLeprechaun entity) {
      return LEPRECHAUN_TEXTURE;
   }

   @Override
   public void doRender(EntityLeprechaun leprechaun, double x, double y, double z, float yaw, float partialTicks) {
      super.doRender(leprechaun, x, y, z, yaw, partialTicks);
   }
}
