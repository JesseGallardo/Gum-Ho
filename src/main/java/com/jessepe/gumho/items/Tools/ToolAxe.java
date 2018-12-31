package com.jessepe.gumho.items.Tools;

import com.jessepe.gumho.Main;
import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.util.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

    public ToolAxe(String name, ToolMaterial material) {
        super(material, 6.0F, -3.2F);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.GUMHO_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
