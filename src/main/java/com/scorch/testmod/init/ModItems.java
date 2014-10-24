package com.scorch.testmod.init;


import com.scorch.testmod.item.ItemLeaf;
import com.scorch.testmod.item.ItemTestMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTestMod leaf = new ItemLeaf();

    public static void init()
    {
        GameRegistry.registerItem(leaf, "Leaf");
    }

}
