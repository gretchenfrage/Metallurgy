package com.phoenixkahlo.metallurgy.crafting;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public class RecipeRemover {

	public static void init() {
		removeCrafting();
		removeSmelting();
	}
	
	private static void removeSmelting() {
		FurnaceRecipes.smelting().getSmeltingList();
		Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
		Iterator<Map.Entry<ItemStack, ItemStack>> iterator = recipes.entrySet().iterator();
		while (iterator.hasNext()) {
			Item result = iterator.next().getValue().getItem();
			if (
					result == Items.iron_ingot ||
					result == Items.gold_ingot
					) {
				iterator.remove();
			}
		}
	}
	
	private static void removeCrafting() {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> iterator = recipes.iterator();
		while (iterator.hasNext()) {
			ItemStack resultItemStack = iterator.next().getRecipeOutput();
			if (resultItemStack != null) {
				Item result = resultItemStack.getItem();
				if (
						result == Items.wooden_axe ||
						result == Items.wooden_hoe ||
						result == Items.wooden_pickaxe ||
						result == Items.wooden_shovel ||
						result == Items.wooden_sword ||
						result == Items.stone_axe ||
						result == Items.stone_hoe ||
						result == Items.stone_pickaxe ||
						result == Items.stone_shovel ||
						result == Items.stone_sword ||
						result == Items.iron_axe ||
						result == Items.iron_door ||
						result == Items.iron_hoe ||
						result == Items.iron_pickaxe ||
						result == Items.iron_shovel ||
						result == Items.iron_sword ||
						result == Items.iron_boots ||
						result == Items.iron_chestplate ||
						result == Items.iron_helmet ||
						result == Items.iron_leggings ||
						result == Items.golden_axe ||
						result == Items.golden_hoe ||
						result == Items.golden_pickaxe ||
						result == Items.golden_shovel ||
						result == Items.golden_sword ||
						result == Items.golden_boots ||
						result == Items.golden_chestplate ||
						result == Items.golden_helmet ||
						result == Items.golden_leggings ||
						result == Items.diamond_axe ||
						result == Items.diamond_hoe ||
						result == Items.diamond_pickaxe ||
						result == Items.diamond_shovel ||
						result == Items.diamond_sword ||
						result == Items.diamond_boots ||
						result == Items.diamond_chestplate ||
						result == Items.diamond_helmet ||
						result == Items.diamond_leggings ||
						result == Items.leather_boots ||
						result == Items.leather_chestplate ||
						result == Items.leather_helmet ||
						result == Items.leather_leggings ||
						result == Items.shears ||
						result == Item.getItemFromBlock(Blocks.iron_block) ||
						result == Item.getItemFromBlock(Blocks.rail) ||
						result == Item.getItemFromBlock(Blocks.golden_rail) ||
						result == Item.getItemFromBlock(Blocks.gold_block) ||
						result == Item.getItemFromBlock(Blocks.furnace)
						) {
					iterator.remove();
				}
			}
		}
	}
	
}
