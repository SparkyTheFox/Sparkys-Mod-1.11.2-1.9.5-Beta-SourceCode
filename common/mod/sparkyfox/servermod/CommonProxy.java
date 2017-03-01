package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.world.WorldGenOre;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	// Client Stuff
	public void registerModels() {
	}

	// Client Stuff
	public void registerRenderer() {
	}

	public void registerEventHandler() {

	}

	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
		
		
	}

	public void init(FMLInitializationEvent event) {
		ModItems.initRecipes();
		ModBlocks.initRecipes();
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);  //Register the ore generator
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
