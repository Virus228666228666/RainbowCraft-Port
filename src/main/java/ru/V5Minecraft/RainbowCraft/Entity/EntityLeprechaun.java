package ru.V5Minecraft.RainbowCraft.Entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import ru.V5Minecraft.RainbowCraft.Register.RegisterItems;

public class EntityLeprechaun extends EntityMob {
   private final BossInfoServer bossInfo = new BossInfoServer(this.getDisplayName(), BossInfo.Color.PINK, BossInfo.Overlay.PROGRESS);

   public EntityLeprechaun(World world) {
      super(world);
   }

   @Override
   public void addTrackingPlayer(EntityPlayerMP player) {
      super.addTrackingPlayer(player);
      this.bossInfo.addPlayer(player);
   }

   @Override
   public void removeTrackingPlayer(EntityPlayerMP player) {
      super.removeTrackingPlayer(player);
      this.bossInfo.removePlayer(player);
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
   }

   @Override
   protected void initEntityAI() {
      this.tasks.addTask(0, new EntityAISwimming(this));
      this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, true));
      this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.8D));
      this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
      this.tasks.addTask(7, new EntityAILookIdle(this));

      this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
      this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, true));
   }

   @Override
   protected void applyEntityAttributes() {
      super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
      this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
      this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
      this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
      this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
   }

   @Override
   protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
      Item mainDrop = Items.GOLD_NUGGET;
      int quantityMain = this.rand.nextInt(6) + 4 + lootingModifier;

      for (int i = 0; i < quantityMain; ++i) {
         this.dropItem(mainDrop, 1);
      }

      Item rareDrop = RegisterItems.shards;
      int quantityRare = 1 + lootingModifier;

      for (int i = 0; i < quantityRare; ++i) {
         this.dropItem(rareDrop, 1);
      }
   }

   @Override
   protected ResourceLocation getLootTable() {
      return null;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float amount) {
      if (source.isMagicDamage()) {
         amount = MathHelper.clamp(amount * 0.5F, 1.0F, Float.MAX_VALUE);
      }
      return super.attackEntityFrom(source, amount);
   }
}
