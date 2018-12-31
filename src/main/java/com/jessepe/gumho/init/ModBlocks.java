package com.jessepe.gumho.init;

import com.jessepe.gumho.blocks.BlockBase;
import com.jessepe.gumho.blocks.GumBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public final static Block GUM_BLOCK = new GumBlock("gum_block", Material.GROUND);

}
