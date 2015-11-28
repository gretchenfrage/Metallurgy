package com.phoenixkahlo.metallurgy.tools;

import com.phoenixkahlo.metallurgy.Metallurgy;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class BasicHoe extends ItemHoe {

	public BasicHoe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Metallurgy.MODID + "_" + name);
		setTextureName(Metallurgy.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
}
