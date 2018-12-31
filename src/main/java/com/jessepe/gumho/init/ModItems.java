package com.jessepe.gumho.init;

import com.jessepe.gumho.items.Armor.ArmorBase;
import com.jessepe.gumho.items.Armor.ArmorEffectBase;
import com.jessepe.gumho.items.Food.FoodBase;
import com.jessepe.gumho.items.Food.FoodEffectBase;
import com.jessepe.gumho.items.Fuel.GumFuel;
import com.jessepe.gumho.items.ItemBase;
import com.jessepe.gumho.items.Tools.*;
import com.jessepe.gumho.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    //TODO:To make a new item, add the name in the lang file, add the json in models/item directory, add the recipe in the recipes directory, and the textures in the textures/items directory

    /*----Others----*/

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial MATERIAL_GUM_INGOT = EnumHelper.addToolMaterial("material_gum_ingot", 2,625,5.5F, 1.75F, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_GUM_INGOT = EnumHelper.addArmorMaterial("armor_material_gum_ingot", Reference.MOD_ID + ":vanilla_gum", 13,
            new int[] {3, 6, 8, 4}, 9, SoundEvents.BLOCK_SLIME_BREAK, 0.0F);

    /*----Vanilla Gum Related Items----*/

    public static final Item VANILLA_GUMSTICK  = new FoodBase("vanilla_gumstick", 0, 0.5F, false);
    public static final Item Vanilla_Smothered_Iron_Ingot = new ItemBase("vanilla_smothered_iron_ingot");
    public static final Item Vanilla_Ingot = new ItemBase("vanilla_ingot");

    public static final ItemSword VANILLA_GUM_SWORD = new ToolSword("vanilla_gum_sword", MATERIAL_GUM_INGOT);
    public static final ItemSpade VANILLA_GUM_SPADE = new ToolSpade("vanilla_gum_spade", MATERIAL_GUM_INGOT);
    public static final ItemPickaxe VANILLA_GUM_PICKAXE = new ToolPickaxe("vanilla_gum_pickaxe", MATERIAL_GUM_INGOT);
    public static final ItemAxe VANILLA_GUM_AXE = new ToolAxe("vanilla_gum_axe", MATERIAL_GUM_INGOT);
    public static final ItemHoe VANILLA_GUM_HOE = new ToolHoe("vanilla_gum_hoe", MATERIAL_GUM_INGOT);

    //public static final Item VANILLA_GUM_HELMET = new ArmorBase("vanilla_gum_helmet", ARMOR_MATERIAL_GUM_INGOT, 1, EntityEquipmentSlot.HEAD);
    public static final Item VANILLA_GUM_HELMET = new ArmorEffectBase("vanilla_gum_helmet", ARMOR_MATERIAL_GUM_INGOT,1, EntityEquipmentSlot.HEAD, createPotionEffect(MobEffects.FIRE_RESISTANCE, 2, 0));
    //public static final Item VANILLA_GUM_CHESTPLATE = new ArmorBase("vanilla_gum_chestplate", ARMOR_MATERIAL_GUM_INGOT, 1, EntityEquipmentSlot.CHEST);
    public static final Item VANILLA_GUM_CHESTPLATE = new ArmorEffectBase("vanilla_gum_chestplate", ARMOR_MATERIAL_GUM_INGOT, 1, EntityEquipmentSlot.CHEST, createPotionEffect(MobEffects.ABSORPTION, 2, 0));
    public static final Item VANILLA_GUM_LEGGINGS = new ArmorBase("vanilla_gum_leggings", ARMOR_MATERIAL_GUM_INGOT, 2, EntityEquipmentSlot.LEGS);
    public static final Item VANILLA_GUM_BOOTS = new ArmorBase("vanilla_gum_boots", ARMOR_MATERIAL_GUM_INGOT, 1, EntityEquipmentSlot.FEET);

    /*----Fire Resistance Gum Related Items----*/

    public static final Item FR_CREAMY_FLAVORING = new ItemBase("fr_creamy_flavoring");
    public static final Item FLAME_RESISTANT_CREAMY_GUMSTICK = new FoodEffectBase("flame_resistant_creamy_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.FIRE_RESISTANCE, 2, 1));

    /*---Normal Resistance Gum Related Items----*/

    public static final Item RESISTANCE_HARDENED_FLAVORING = new ItemBase("resistance_hardened_flavoring");
    public static final Item RESISTANCE_HARDENED_GUMSTICK = new FoodEffectBase("resistance_hardened_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.RESISTANCE, 2, 1));

    /*----Jump Boost Gum Related Items----*/

    public static final Item JUMP_BOOST_MEATY_FLAVORING = new ItemBase("jump_boost_meaty_flavoring");
    public static final Item JUMP_BOOST_MEATY_GUMSTICK = new FoodEffectBase("jump_boost_meaty_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.JUMP_BOOST, 2, 1));

    /*----Regeneration Gum Related Items----*/

    public static final Item REGENERATION_HEARTY_FLAVORING = new ItemBase("regeneration_hearty_flavoring");
    public static final Item REGENERATION_HEARTY_GUNSTICK = new FoodEffectBase("regeneration_hearty_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.REGENERATION, 2, 1));

    /*----Water Breathing Gum Related Items----*/

    public static final Item WATER_BREATHING_SMELLY_FLAVORING = new ItemBase("water_breathing_smelly_flavoring");
    public static final Item WATER_BREATHING_SMELLY_GUMSTICK = new FoodEffectBase("water_breathing_smelly_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.WATER_BREATHING, 2, 1));

    /*----Night Vision Gum Related Items----*/
 
    public static final Item NIGHT_VISION_FLAVORING = new ItemBase("night_vision_flavoring");
    public static final Item NIGHT_VISION_GUMSTICK = new FoodEffectBase("night_vision_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.NIGHT_VISION, 2, 1));

    /*----Strength Gum Related Items-----*/

    public static final Item STRENGTH_EDGY_FLAVORING = new ItemBase("strength_edgy_flavoring");
    public static final Item STRENGTH_EDGY_GUNSTICK = new FoodEffectBase("strength_edgy_gumstick", 0, 0.5F, false,
            createPotionEffect(MobEffects.STRENGTH, 2, 1));

    /*----Coal Gum----*/

    public static final Item COAL_FLAVORING = new ItemBase("coal_flavoring");
    public static final Item COAL_GUMSTICK = new GumFuel("coal_gumball", 16000 * 8);

    /*Helper Methods*/

    private static PotionEffect createPotionEffect(Potion effects, int timeInMin, int amp){
        return new PotionEffect(effects, timeInMin * (60 * 20), amp, false, true);
    }

}
