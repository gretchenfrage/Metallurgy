package com.phoenixkahlo.metallurgy.tools;

import com.phoenixkahlo.metallurgy.Metallurgy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BasicPickaxe extends ItemPickaxe {

	public BasicPickaxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Metallurgy.MODID + "_" + name);
		setTextureName(Metallurgy.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
}
