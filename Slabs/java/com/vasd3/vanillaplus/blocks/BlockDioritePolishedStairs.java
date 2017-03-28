package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockDioritePolishedStairs extends BlockStairs {

	public BlockDioritePolishedStairs(IBlockState state) {
		super(state);
		setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITEPOLISHEDSTAIRS.getunlocalizedName());
		setRegistryName(Reference.VanillaPlusBlocks.DIORITEPOLISHEDSTAIRS.getRegistyName());
		setHardness(1.5F);
		setResistance(30F);
		setCreativeTab(VanillaPlus.tabVanillaPlus);		
		this.useNeighborBrightness = true;
	}
}
