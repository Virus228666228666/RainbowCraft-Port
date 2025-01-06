package ru.V5Minecraft.RainbowCraft.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityRainbowBall extends EntityThrowable {
   public EntityRainbowBall(World world) {
      super(world);
   }

   public EntityRainbowBall(World world, EntityLivingBase thrower) {
      super(world, thrower);
   }

   public EntityRainbowBall(World world, double x, double y, double z) {
      super(world, x, y, z);
   }

   @Override
   protected void onImpact(RayTraceResult result) {
      if (result.entityHit != null) {
         float damage = 5.0F;
         result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);
      }

      if (!this.world.isRemote) {
         this.setDead();
      }

      spawnImpactParticles();
      this.playSound(SoundEvents.ENTITY_SNOWBALL_THROW, 1.0F, 0.8F + this.rand.nextFloat() * 0.4F);
   }

   @SideOnly(Side.CLIENT)
   private void spawnImpactParticles() {
      for (int i = 0; i < 8; ++i) {
         Vec3d particlePos = new Vec3d(
                 this.posX + (this.rand.nextDouble() - 0.5) * 0.2,
                 this.posY + (this.rand.nextDouble() - 0.5) * 0.2,
                 this.posZ + (this.rand.nextDouble() - 0.5) * 0.2
         );
         this.world.spawnParticle(
                 net.minecraft.util.EnumParticleTypes.SNOWBALL,
                 particlePos.x, particlePos.y, particlePos.z,
                 0.0D, 0.0D, 0.0D
         );
      }
   }
}
