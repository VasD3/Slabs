package com.vasd3.vanillaplus.proxy;

import com.vasd3.vanillaplus.init.ModBlocks;

public class ServerProxy extends CommonProxy {
	
	@Override
	public void preInit() {
		
	}
	
	@Override
	public void init() {
		ModBlocks.registerRenders();
	}
	
	@Override
	public void registerRenders() {
		
	}
}