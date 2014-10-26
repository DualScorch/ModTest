package com.scorch.testmod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tree),"ddd", "lll", "ddd", 'd', "gemDiamond", 'l', "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.leaf), new ItemStack(ModBlocks.tree), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves), new ItemStack(Blocks.leaves)));
    }
}
