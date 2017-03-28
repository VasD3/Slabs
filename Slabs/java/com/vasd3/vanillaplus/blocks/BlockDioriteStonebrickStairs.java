package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockDioriteStonebrickStairs extends BlockStairs {

	public BlockDioriteStonebrickStairs(IBlockState state) {
		super(state);
		setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITESTONEBRICKSTAIRS.getunlocalizedName());
		setRegistryName(Reference.VanillaPlusBlocks.DIORITESTONEBRICKSTAIRS.getRegistyName());
		setHardness(1.5F);
		setResistance(30F);
		setCreativeTab(VanillaPlus.tabVanillaPlus);	
		this.useNeighborBrightness = true;
	}
}
