package com.scorch.testmod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.tree),"ddd", "   ", "ddd", 'd', new ItemStack(Items.diamond), 'l', new ItemStack(Blocks.wooden_slab));
        GameRegistry.addRecipe(new ItemStack(ModItems.leaf), "lll", "lwl", "lll", 'l', new ItemStack(Blocks.leaves), 'w', new ItemStack(ModBlocks.tree));
    }
}
