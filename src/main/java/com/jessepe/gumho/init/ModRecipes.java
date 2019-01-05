package com.jessepe.gumho.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes{

    public static void init(){
        GameRegistry.addSmelting(ModItems.Vanilla_Smothered_Iron_Ingot, new ItemStack(ModItems.Vanilla_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.Resistance_Hardened_Smothered_Ingot, new ItemStack(ModItems.Resistance_Hardened_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.FR_Smothered_Ingot, new ItemStack(ModItems.FR_Gum_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.JB_Smothered_Ingot, new ItemStack(ModItems.JB_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.RG_Smothered_Ingot, new ItemStack(ModItems.RG_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.NV_Smothered_Ingot, new ItemStack(ModItems.NV_Ingot), 0.5F);
        GameRegistry.addSmelting(ModItems.WB_Smothered_Ingot, new ItemStack(ModItems.WB_Ingot), 0.5F);
    }

}
