package com.scorch.testmod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.tree),"ddd", "lll", "ddd", 'd', new ItemStack(Items.diamond), 'l', new ItemStack(Blocks.log));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.leaf), new ItemStack(ModBlocks.tree), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves));
    }
}
