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
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_VANILLA_GUM_INGOT = EnumHelper.addArmorMaterial("armor_material_gum_ingot", Reference.MOD_ID + ":vanilla_gum", 13,
            new int[] {3, 6, 8, 4}, 9, SoundEvents.BLOCK_SLIME_BREAK, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_FR_GUM_INGOT = EnumHelper.addArmorMaterial("armor_material_gum_ingot", Reference.MOD_ID + ":fr_gum", 13,
            new int[] {3, 6, 8, 4}, 3, SoundEvents.BLOCK_SLIME_BREAK, 0.0F);

    public static Item Vanilla_Gumstick;
    public static Item Vanilla_Smothered_Iron_Ingot;
    public static Item Vanilla_Ingot;

    public static ItemSword Vanilla_Gum_Sword;
    public static ItemSpade Vanilla_Gum_Spade;
    public static ItemPickaxe Vanilla_Gum_Pickaxe;
    public static ItemAxe Vanilla_Gum_Axe;
    public static ItemHoe Vanilla_Gum_Hoe;

    public static Item Vanilla_Gum_Helmet;
    public static Item Vanilla_Gum_Chestplate;
    public static Item Vanilla_Gum_Leggings;
    public static Item Vanilla_Gum_Boots;


    public static Item FR_Creamy_Flavoring;
    public static Item FR_Creamy_Gumstick;
    public static Item FR_Gum_Helmet;
    public static Item FR_Gum_Chestplate;
    public static Item FR_Gum_Leggings;
    public static Item FR_Gum_Boots;


    public static Item Resistance_Hardened_Flavoring;
    public static Item Resistance_Hardened_Gumstick;


    public static Item Jump_Boost_Flavoring;
    public static Item Jump_Boost_Gumstick;


    public static Item Regeneration_Flavoring;
    public static Item Regeneration_Gumstick;


    public static Item Water_Breathing_Flavoring;
    public static Item Water_Breathing_Gumstick;


    public static Item Night_Vision_Flavoring;
    public static Item Night_Vision_Gumstick;


    public static Item Strength_Flavoring;
    public static Item Strength_Gumstick;


    public static Item Coal_Flavoring;
    public static Item Coal_Gumstick;


    private static PotionEffect fr = createPotionEffect(MobEffects.FIRE_RESISTANCE, 2, 0);
    private static PotionEffect rs = createPotionEffect(MobEffects.RESISTANCE, 2, 0);
    private static PotionEffect jb = createPotionEffect(MobEffects.JUMP_BOOST, 2, 0);
    private static PotionEffect rg = createPotionEffect(MobEffects.REGENERATION, 2, 0);
    private static PotionEffect wb = createPotionEffect(MobEffects.WATER_BREATHING, 2,0);
    private static PotionEffect nv = createPotionEffect(MobEffects.NIGHT_VISION, 2, 0);
    private static PotionEffect st = createPotionEffect(MobEffects.STRENGTH, 2, 0);

    /*----Helper Methods----*/

    private static PotionEffect createPotionEffect(Potion effects, int timeInMin, int amp){ return new PotionEffect(effects, timeInMin * (60 * 20), amp, false, true); }

    public static void registerItems(){

        registerMaterials();
        registerOtherItems();
        registerFoodItems();
        registerIngotsGems();
        registerArmorTools();

    }

    private static void registerFoodItems(){
        Vanilla_Gumstick =  new FoodBase("vanilla_gumstick", 0, 0.5F, false);

        FR_Creamy_Flavoring = new ItemBase("fr_creamy_flavoring");
        FR_Creamy_Gumstick = new FoodEffectBase("flame_resistant_creamy_gumstick", 0, 0.5F, false, fr);

        Resistance_Hardened_Flavoring = new ItemBase("resistance_hardened_flavoring");
        Resistance_Hardened_Gumstick = new FoodEffectBase("resistance_hardened_gumstick", 0, 0.5F, false, rs);

        Jump_Boost_Flavoring = new ItemBase("jump_boost_meaty_flavoring");
        Jump_Boost_Gumstick = new FoodEffectBase("jump_boost_meaty_gumstick", 0, 0.5F, false, jb);

        Regeneration_Flavoring = new ItemBase("regeneration_hearty_flavoring");
        Regeneration_Gumstick = new FoodEffectBase("regeneration_hearty_gumstick", 0, 0.5F, false, rg);

        Water_Breathing_Flavoring = new ItemBase("water_breathing_smelly_flavoring");
        Water_Breathing_Gumstick = new FoodEffectBase("water_breathing_smelly_gumstick", 0, 0.5F, false, wb);

        Night_Vision_Flavoring = new ItemBase("night_vision_flavoring");
        Night_Vision_Gumstick = new FoodEffectBase("night_vision_gumstick", 0, 0.5F, false, nv);

        Strength_Flavoring = new ItemBase("strength_edgy_flavoring");
        Strength_Gumstick = new FoodEffectBase("strength_edgy_gumstick", 0, 0.5F, false, st);

    }

    private static void registerArmorTools(){
        Vanilla_Gum_Sword = new ToolSword("vanilla_gum_sword", MATERIAL_GUM_INGOT);
        Vanilla_Gum_Spade = new ToolSpade("vanilla_gum_spade", MATERIAL_GUM_INGOT);
        Vanilla_Gum_Pickaxe = new ToolPickaxe("vanilla_gum_pickaxe", MATERIAL_GUM_INGOT);
        Vanilla_Gum_Axe = new ToolAxe("vanilla_gum_axe", MATERIAL_GUM_INGOT);
        Vanilla_Gum_Hoe = new ToolHoe("vanilla_gum_hoe", MATERIAL_GUM_INGOT);
        Vanilla_Gum_Helmet = new ArmorBase("vanilla_gum_helmet", ARMOR_MATERIAL_VANILLA_GUM_INGOT, 1, EntityEquipmentSlot.HEAD);
        Vanilla_Gum_Chestplate = new ArmorBase("vanilla_gum_chestplate", ARMOR_MATERIAL_VANILLA_GUM_INGOT, 1, EntityEquipmentSlot.CHEST);
        Vanilla_Gum_Leggings = new ArmorBase("vanilla_gum_leggings", ARMOR_MATERIAL_VANILLA_GUM_INGOT, 2, EntityEquipmentSlot.LEGS);
        Vanilla_Gum_Boots = new ArmorBase("vanilla_gum_boots", ARMOR_MATERIAL_VANILLA_GUM_INGOT, 1, EntityEquipmentSlot.FEET);

        FR_Gum_Helmet = new ArmorEffectBase("fr_gum_helmet", ARMOR_MATERIAL_FR_GUM_INGOT, 1, EntityEquipmentSlot.HEAD, fr);
        FR_Gum_Chestplate = new ArmorEffectBase("fr_gum_chestplate", ARMOR_MATERIAL_FR_GUM_INGOT, 1, EntityEquipmentSlot.CHEST, fr);
        FR_Gum_Leggings = new ArmorEffectBase("fr_gum_leggings", ARMOR_MATERIAL_FR_GUM_INGOT, 2, EntityEquipmentSlot.LEGS, fr);
        FR_Gum_Boots = new ArmorEffectBase("fr_gum_boots", ARMOR_MATERIAL_FR_GUM_INGOT, 1, EntityEquipmentSlot.FEET, fr);
    }

    private static void registerMaterials(){

    }

    private static void registerIngotsGems(){
        Vanilla_Smothered_Iron_Ingot = new ItemBase("vanilla_smothered_iron_ingot");
        Vanilla_Ingot = new ItemBase("vanilla_ingot");
    }

    private static void registerOtherItems(){
        Coal_Flavoring = new ItemBase("coal_flavoring");
        Coal_Gumstick = new GumFuel("coal_gumball", 16000 * 8);

    }

}
