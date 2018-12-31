package com.jessepe.gumho.items.Food;

import com.jessepe.gumho.GumHo;
import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.util.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood){
        super(amount, saturation, isAnimalFood);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GumHo.GUMHO_TAB);
        setAlwaysEdible();

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        GumHo.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
