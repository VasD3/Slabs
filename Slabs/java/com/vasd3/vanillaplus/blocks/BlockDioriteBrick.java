package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDioriteBrick extends Block {

		public BlockDioriteBrick() {
			super(Material.ROCK);
			setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITEBRICK.getunlocalizedName());
			setRegistryName(Reference.VanillaPlusBlocks.DIORITEBRICK.getRegistyName());
			setHardness(1.5F);
			setResistance(30F);
			setCreativeTab(VanillaPlus.tabVanillaPlus);
		}
}
