package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockDioriteStairs extends BlockStairs {

	public BlockDioriteStairs(IBlockState state) {
		super(state);
		setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITESTAIRS.getunlocalizedName());
		setRegistryName(Reference.VanillaPlusBlocks.DIORITESTAIRS.getRegistyName());
		setHardness(1.5F);
		setResistance(30F);
		setCreativeTab(VanillaPlus.tabVanillaPlus);		
		this.useNeighborBrightness = true;
	}
}
