package com.phoenixkahlo.metallurgy.tools;

import com.phoenixkahlo.metallurgy.Metallurgy;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BasicSword extends ItemSword {

	public BasicSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Metallurgy.MODID + "_" + name);
		setTextureName(Metallurgy.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
}
