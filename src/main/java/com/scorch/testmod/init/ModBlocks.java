package com.scorch.testmod.init;

import com.scorch.testmod.block.BlockBetterTree;
import com.scorch.testmod.block.BlockModTest;
import com.scorch.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockModTest tree = new BlockBetterTree();

    public static void init()
    {
        GameRegistry.registerBlock(tree, "Tree");
    }
}
