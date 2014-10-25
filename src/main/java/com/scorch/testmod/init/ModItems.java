package com.scorch.testmod.init;

import com.scorch.testmod.item.ItemTabLabel;
import com.scorch.testmod.item.ItemLeaf;
import com.scorch.testmod.item.ItemTestMod;
import com.scorch.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTestMod leaf = new ItemLeaf();
    public static final ItemTestMod tablabel = new ItemTabLabel();

    public static void init() {
        GameRegistry.registerItem(leaf, "Leaf");
        GameRegistry.registerItem(tablabel, "tablabel");

    }

}
