package com.scorch.testmod.block;

import com.scorch.testmod.creativetab.CreativeTabTestMod;
import net.minecraft.item.Item;

public class BlockBetterTree extends BlockModTest
{
    public BlockBetterTree()
    {
        super();
        this.setBlockName("tree");
        this.setBlockTextureName("tree");
        this.setLightLevel(1);
        this.blockHardness=5F;
        this.blockResistance=10F;
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
    }
}
