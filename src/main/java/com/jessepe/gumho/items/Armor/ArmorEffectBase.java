package com.jessepe.gumho.items.Armor;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ArmorEffectBase extends ArmorBase {

    PotionEffect effect;

    public ArmorEffectBase(String name, ItemArmor.ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, PotionEffect effect){
        super(name, material, renderIndexIn, equipmentSlotIn);

        this.effect = effect;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item){

        if (player.inventory.armorItemInSlot(0) != null || player.inventory.armorItemInSlot(1) != null || player.inventory.armorItemInSlot(2) != null || player.inventory.armorItemInSlot(3) != null){
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
        }

    }
}
