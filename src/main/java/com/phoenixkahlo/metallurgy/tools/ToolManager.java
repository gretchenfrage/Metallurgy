package com.phoenixkahlo.metallurgy.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolManager {

	public static final ToolMaterial CRUDE_ROCK = EnumHelper.addToolMaterial("crude rock", 1, 60, 2.0F, 0.0F, 0);
	
	public static final Item CRUDE_ROCK_AXE = new BasicAxe(CRUDE_ROCK, "crude_rock_axe");
	public static final Item CRUDE_ROCK_HOE = new BasicHoe(CRUDE_ROCK, "crude_rock_hoe");
	public static final Item CRUDE_ROCK_PICKAXE = new BasicPickaxe(CRUDE_ROCK, "crude_rock_pickaxe");
	public static final Item CRUDE_ROCK_SHOVEL = new BasicShovel(CRUDE_ROCK, "crude_rock_shovel");
	public static final Item CRUDE_ROCK_SWORD = new BasicSword(CRUDE_ROCK, "crude_rock_sword");
	
	public static void preInit() {
		GameRegistry.registerItem(CRUDE_ROCK_AXE, "CrudeRockAxe");
		GameRegistry.registerItem(CRUDE_ROCK_HOE, "CrudeRockHoe");
		GameRegistry.registerItem(CRUDE_ROCK_PICKAXE, "CrudeRockPickaxe");
		GameRegistry.registerItem(CRUDE_ROCK_SHOVEL, "CrudeRockShovel");
		GameRegistry.registerItem(CRUDE_ROCK_SWORD, "CrudeRockSword");
	}
	
}
