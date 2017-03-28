package com.vasd3.vanillaplus.blocks;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockDioriteGridStairs extends BlockStairs {

		public BlockDioriteGridStairs(IBlockState state) {
			super(state);
			setUnlocalizedName(Reference.VanillaPlusBlocks.DIORITEGRIDSTAIRS.getunlocalizedName());
			setRegistryName(Reference.VanillaPlusBlocks.DIORITEGRIDSTAIRS.getRegistyName());
			setHardness(1.5F);
			setResistance(30F);
			setCreativeTab(VanillaPlus.tabVanillaPlus);		
			this.useNeighborBrightness = true;
		}
}
