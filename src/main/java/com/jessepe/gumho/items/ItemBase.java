package com.jessepe.gumho.items;

import com.jessepe.gumho.GumHo;
import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GumHo.GUMHO_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        GumHo.proxy.registerItemRenderer(this, 0, "inventory");
    }
}


