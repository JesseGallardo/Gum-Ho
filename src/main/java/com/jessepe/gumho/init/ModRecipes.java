package com.jessepe.gumho.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes{

    public static void init(){
        GameRegistry.addSmelting(ModItems.Vanilla_Smothered_Iron_Ingot, new ItemStack(ModItems.Vanilla_Ingot), 0.5F);
    }

}
