package com.jessepe.gumho.items.Tools;

import com.jessepe.gumho.GumHo;
import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

    public ToolSword(String name, ToolMaterial material){
        super(material);

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
