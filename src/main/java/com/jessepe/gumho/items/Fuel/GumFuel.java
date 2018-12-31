package com.jessepe.gumho.items.Fuel;

import com.jessepe.gumho.items.ItemBase;
import net.minecraft.item.ItemStack;


public class GumFuel extends ItemBase {

    int fuelTime;

    public GumFuel(String name, int fuelTime){
        super(name);

        this.fuelTime = fuelTime;
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return fuelTime;
    }
}
