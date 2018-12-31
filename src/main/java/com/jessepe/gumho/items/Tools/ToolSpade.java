package com.jessepe.gumho.items.Tools;

import com.jessepe.gumho.Main;
import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{

    public ToolSpade(String name, ToolMaterial material){
        super(material);

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
