package ru.V5Minecraft.RainbowCraft.items;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRainbowArmor extends ItemArmor {
   public static final ItemArmor.ArmorMaterial ItemRainbowArmor = EnumHelper.addArmorMaterial("ItemRainbowArmor", "rainbowcraft:rainbow", 9, new int[]{3, 6, 8, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.OBSIDIAN)));
   public ItemRainbowArmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
      super(ItemRainbowArmor, renderIndexIn, equipmentSlotIn);
      this.setRegistryName(name);
      this.setUnlocalizedName(name);
      this.setCreativeTab(null);
   }
}
