package com.vasd3.vanillaplus;

public class Reference {
	
	public static final String MOD_ID = "vvp";
	public static final String NAME = "VasD3's Vanilla Plus Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";

	public static final String CLIENT_PROXY_CLASS = "com.vasd3.vanillaplus.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.vasd3.vanillaplus.proxy.ServerProxy";
	
	public static enum VanillaPlusBlocks {
		DIORITESTAIRS("diorite_stairs", "BlockDioriteStairs"),
		DIORITEPOLISHEDSTAIRS("diorite_polished_stairs", "BlockDioritePolishedStairs"),
		DIORITESTONEBRICK("diorite_stonebrick", "BlockDioriteStonebrick"),
		DIORITESTONEBRICKSTAIRS("diorite_stonebrick_stairs", "BlockDioriteStonebrickStairs"), 
		DIORITEBRICK("diorite_brick", "BlockDioriteBrick"), 
		DIORITEBRICKSTAIRS("diorite_brick_stairs", "BlockDioriteBrickStairs"),
		DIORITEGRID("diorite_grid", "BlockDioriteGrid"), 
		DIORITEGRIDSTAIRS("diorite_grid_stairs", "BlockDioriteGridStairs");
		
		private String unlocalizedName;
		private String registryName;
		
		VanillaPlusBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getunlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistyName() {
			return registryName;
		}
	}

}
