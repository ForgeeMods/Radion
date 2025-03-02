package com.github.ImagineForge.Radion.content.armor;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.registry.item.RegisterItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class HazmatSuitMaterial implements ArmorMaterial {

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return 20;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return 5;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(RegisterItems.URANIUM_INGOT.get());
    }

    @Override
    public String getName() {
        return Constants.MOD_ID + ":hazmat";
    }

    @Override
    public float getToughness() {
        return 3.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1f;
    }

}
