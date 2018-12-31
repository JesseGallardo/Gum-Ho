package com.jessepe.gumho.util;

import com.jessepe.gumho.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class tabGumHo extends CreativeTabs{

    public tabGumHo(String label){
        super("Gum-Ho");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.Vanilla_Ingot);
    }
}
