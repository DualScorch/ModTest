package com.scorch.testmod.item;


import com.scorch.testmod.creativetab.CreativeTabTestMod;

public class ItemLeaf extends ItemTestMod
{
    public ItemLeaf()
    {
        super();
        this.setUnlocalizedName("Leaf");
        this.maxStackSize=16;
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
    }
}
