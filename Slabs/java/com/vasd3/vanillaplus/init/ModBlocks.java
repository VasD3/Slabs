package com.vasd3.vanillaplus.init;
 
 import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.blocks.BlockDioriteBrick;
import com.vasd3.vanillaplus.blocks.BlockDioriteBrickStairs;
import com.vasd3.vanillaplus.blocks.BlockDioriteGrid;
import com.vasd3.vanillaplus.blocks.BlockDioriteGridStairs;
import com.vasd3.vanillaplus.blocks.BlockDioritePolishedStairs;
import com.vasd3.vanillaplus.blocks.BlockDioriteSlabDouble;
import com.vasd3.vanillaplus.blocks.BlockDioriteSlabHalf;
import com.vasd3.vanillaplus.blocks.BlockDioriteStairs;
import com.vasd3.vanillaplus.blocks.BlockDioriteStonebrick;
import com.vasd3.vanillaplus.blocks.BlockDioriteStonebrickStairs;
import com.vasd3.vanillaplus.blocks.BlockGraniteSlabDouble;
import com.vasd3.vanillaplus.blocks.BlockGraniteSlabHalf;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
 public class ModBlocks {
 	
 	public static Block diorite_stairs;
 	public static Block diorite_polished_stairs;
 	public static Block diorite_stonebrick;
	public static Block diorite_stonebrick_stairs;
	public static Block diorite_brick;
	public static Block diorite_brick_stairs;
	public static Block diorite_grid;
	public static Block diorite_grid_stairs;
	
 	public static BlockDioriteSlabHalf dioriteSlabHalf;
 	public static BlockDioriteSlabDouble dioriteSlabDouble;
 
 	public static BlockGraniteSlabHalf graniteSlabHalf;
 	public static BlockGraniteSlabDouble graniteSlabDouble;
 	
 	public static void init() {
 		diorite_stairs = new BlockDioriteStairs(Blocks.STONE.getDefaultState());
 		diorite_polished_stairs = new BlockDioritePolishedStairs(Blocks.STONE.getDefaultState());
 		diorite_stonebrick = new BlockDioriteStonebrick();
 		diorite_stonebrick_stairs = new BlockDioriteStonebrickStairs(Blocks.STONE.getDefaultState());
 		diorite_brick = new BlockDioriteBrick();
 		diorite_brick_stairs = new BlockDioriteBrickStairs(Blocks.STONE.getDefaultState());
 		diorite_grid = new BlockDioriteGrid();
 		diorite_grid_stairs = new BlockDioriteGridStairs(Blocks.STONE.getDefaultState());
 		
 		dioriteSlabHalf = new BlockDioriteSlabHalf("diorite_slab_half");
 		dioriteSlabDouble = new BlockDioriteSlabDouble("diorite_slab_double");
 	
 		graniteSlabHalf = new BlockGraniteSlabHalf("granite_slab_half");
 		graniteSlabDouble = new BlockGraniteSlabDouble("granite_slab_double");
 	
 	}
 	
 	public static void register() {
 		registerBlock(diorite_stairs);
 		registerBlock(diorite_polished_stairs);
 		registerBlock(diorite_stonebrick);
 		registerBlock(diorite_stonebrick_stairs);
 		registerBlock(diorite_brick);
 		registerBlock(diorite_brick_stairs);
 		registerBlock(diorite_grid);
 		registerBlock(diorite_grid_stairs);
 		
 		registerBlock(dioriteSlabHalf, new ItemSlab(dioriteSlabHalf, dioriteSlabHalf, dioriteSlabDouble));
 		GameRegistry.register(dioriteSlabDouble);
 	
 		registerBlock(graniteSlabHalf, new ItemSlab(graniteSlabHalf, graniteSlabHalf, graniteSlabDouble));
 		GameRegistry.register(graniteSlabDouble);
 	}
 	
 	public static void registerRenders() {
 		registerRender(diorite_stairs);
 		registerRender(diorite_polished_stairs);
 		registerRender(diorite_stonebrick);
 		registerRender(diorite_stonebrick_stairs);
 		registerRender(diorite_brick);
 		registerRender(diorite_brick_stairs);
 		registerRender(diorite_grid);
 		registerRender(diorite_grid_stairs);
 		
 		registerRender(dioriteSlabHalf);
 		
 		registerRender(graniteSlabHalf);
 	}
 	
 	public static void registerBlock(Block block) {
 		GameRegistry.register(block);
 		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
 	}
 	
 	public static void registerBlock(Block block, ItemBlock itemBlock) {
 		GameRegistry.register(block);
 		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
 	}
 	
 	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
 	
 	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
 	}
 }