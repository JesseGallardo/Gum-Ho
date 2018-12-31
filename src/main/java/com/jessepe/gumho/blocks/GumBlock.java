package com.jessepe.gumho.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GumBlock extends BlockBase {

    public GumBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.GROUND);
        setHardness(1.0F);
        setResistance(4.0F);
        setHarvestLevel("axe", 0);

    }

}
