package com.phoenixkahlo.metallurgy.tools;

import com.phoenixkahlo.metallurgy.Metallurgy;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BasicAxe extends ItemAxe {

	public BasicAxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Metallurgy.MODID + "_" + name);
		setTextureName(Metallurgy.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
}
