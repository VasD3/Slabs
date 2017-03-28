package com.vasd3.vanillaplus;

import com.vasd3.vanillaplus.init.ModBlocks;
import com.vasd3.vanillaplus.init.ModCrafting;
import com.vasd3.vanillaplus.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class VanillaPlus {

	@Instance
	public static VanillaPlus instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModBlocks.register();
		
		proxy.preInit();
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModCrafting.register();
		
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabVanillaPlus = new CreativeTabs("tab_vanillaplus") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.diorite_stonebrick);
		}
	};
}
