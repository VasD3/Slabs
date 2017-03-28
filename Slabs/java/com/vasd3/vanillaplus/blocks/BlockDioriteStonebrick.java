package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDioriteStonebrick extends Block {

	public BlockDioriteStonebrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITESTONEBRICK.getunlocalizedName());
		setRegistryName(Reference.VanillaPlusBlocks.DIORITESTONEBRICK.getRegistyName());
		setHardness(1.5F);
		setResistance(30F);
		setCreativeTab(VanillaPlus.tabVanillaPlus);
	}
}
