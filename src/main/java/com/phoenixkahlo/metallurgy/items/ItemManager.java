package com.phoenixkahlo.metallurgy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemManager {

	public static final Item ROCK = new Rock();
	
	public static void preInit() {
		GameRegistry.registerItem(ROCK, "Rock");
	}
	
}
