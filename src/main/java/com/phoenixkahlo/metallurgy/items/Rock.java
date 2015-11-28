package com.phoenixkahlo.metallurgy.items;

import com.phoenixkahlo.metallurgy.Metallurgy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Rock extends Item {

	public static final String NAME = "rock";
	
	public Rock() {
		setUnlocalizedName(Metallurgy.MODID + "_" + NAME);
		setTextureName(Metallurgy.MODID + ":" + NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
}
