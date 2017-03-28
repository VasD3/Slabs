package com.vasd3.vanillaplus.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_stairs, 4), "D  ","DD ", "DDD", 'D', new ItemStack(Blocks.STONE, 3, 3));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_polished_stairs, 4), "D  ","DD ", "DDD", 'D', new ItemStack(Blocks.STONE, 4, 4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_stonebrick, 4), "DD","DD", 'D', new ItemStack(Blocks.STONE, 4, 4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_stonebrick_stairs, 4), "D  ","DD ", "DDD", 'D', ModBlocks.diorite_stonebrick);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_brick, 4), "DD", "DD", 'D', ModBlocks.diorite_stonebrick);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_brick_stairs, 4), "D  ","DD ", "DDD", 'D', ModBlocks.diorite_brick);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_grid, 4), "DD", "DD", 'D', ModBlocks.diorite_brick);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diorite_grid_stairs, 4), "D  ","DD ", "DDD", 'D', ModBlocks.diorite_grid);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.dioriteSlabHalf, 6), "DDD", 'D', new ItemStack(Blocks.STONE, 3, 3));
	}
}
