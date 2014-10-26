package com.scorch.testmod.creativetab;

import com.scorch.testmod.init.ModItems;
import com.scorch.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTestMod {
    public static final CreativeTabs TESTMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {


        @Override
        public Item getTabIconItem() {
            return ModItems.tablabel;
        }

    };

}