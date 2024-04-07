package ru.V5Minecraft.RainbowCraft.gui;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.Field;

public class RCReflectionHelper {
   public static Field removeFinal(Class classToAccess, Object instance, String... fieldNames) {
      Field field = ReflectionHelper.findField(classToAccess, ObfuscationReflectionHelper.remapFieldNames(classToAccess.getName(), fieldNames));

      try {
         Field modifiersField = Field.class.getDeclaredField("modifiers");
         modifiersField.setAccessible(true);
         modifiersField.setInt(field, field.getModifiers() & -17);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return field;
   }

   public static void setPrivateFinalValue(Class classToAccess, Object instance, Object value, String... fieldNames) {
      Field field = ReflectionHelper.findField(classToAccess, ObfuscationReflectionHelper.remapFieldNames(classToAccess.getName(), fieldNames));

      try {
         Field modifiersField = Field.class.getDeclaredField("modifiers");
         modifiersField.setAccessible(true);
         modifiersField.setInt(field, field.getModifiers() & -17);
         field.set(instance, value);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }
}
