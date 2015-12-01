package com.phoenixkahlo.metallurgy.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockManager {
	
	public static final Block CAMP_FIRE = new CampFire();

	public static void preInit() {
		GameRegistry.registerBlock(CAMP_FIRE, "CampFire");
	}
	
}
