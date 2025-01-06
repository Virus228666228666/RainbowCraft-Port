package ru.V5Minecraft.RainbowCraft.Entity.fx;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntityRainbowBlastFX extends Particle {
   public EntityRainbowBlastFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ) {
      super(world, x, y, z, motionX, motionY, motionZ);
      this.particleRed = 1.0F;
      this.particleGreen = 0.5F;
      this.particleBlue = 0.8F;
      this.particleAlpha = 1.0F;
      this.particleScale = 0.2F;
      this.particleMaxAge = 20;
      this.motionX = motionX;
      this.motionY = motionY;
      this.motionZ = motionZ;
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.particleAlpha *= 0.95F;

      if (this.particleAlpha <= 0.05F) {
         this.setExpired();
      }
   }

   @Override
   public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
      super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
   }
}
