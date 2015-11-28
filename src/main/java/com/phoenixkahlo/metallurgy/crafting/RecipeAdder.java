package com.phoenixkahlo.metallurgy.crafting;

import com.phoenixkahlo.metallurgy.items.ItemManager;
import com.phoenixkahlo.metallurgy.tools.ToolManager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeAdder {

	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.ROCK), Blocks.dirt);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ToolManager.CRUDE_ROCK_PICKAXE), ItemManager.ROCK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolManager.CRUDE_ROCK_AXE), " X", "X ", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(ToolManager.CRUDE_ROCK_HOE), "X ", "X ", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(ToolManager.CRUDE_ROCK_SHOVEL), "  ", "XX", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(ToolManager.CRUDE_ROCK_SWORD), " C", "S ", 'C', Blocks.cobblestone, 'S', Items.stick);
	}
	
}
