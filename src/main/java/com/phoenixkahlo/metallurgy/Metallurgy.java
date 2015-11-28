package com.phoenixkahlo.metallurgy;

import com.phoenixkahlo.metallurgy.blocks.BlockManager;
import com.phoenixkahlo.metallurgy.crafting.RecipeAdder;
import com.phoenixkahlo.metallurgy.crafting.RecipeRemover;
import com.phoenixkahlo.metallurgy.items.ItemManager;
import com.phoenixkahlo.metallurgy.tools.ToolManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Metallurgy.MODID, version = Metallurgy.VERSION)
public class Metallurgy {

	public static final String MODID = "metallurgy";
	public static final String VERSION = "1.0.0";
	
	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		ItemManager.preInit();
		ToolManager.preInit();
		BlockManager.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		RecipeRemover.init();
		RecipeAdder.init();
	}
	
}
