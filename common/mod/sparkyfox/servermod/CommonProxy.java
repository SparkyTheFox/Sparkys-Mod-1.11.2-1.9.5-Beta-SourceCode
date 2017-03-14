package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModEntities;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvent;
import mod.sparkyfox.servermod.world.WorldGenOre;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

//===========================================================================================================================================================================================\\	
																									//Client Stuff\\
	
	public void registerModels() {
	}

	public void registerRenderer() {
	}

	public void registerEntity() {
	}
	
	public void registerEventHandler() {
	}
	
	@SuppressWarnings("unused")
	private ModSoundEvent sounds;
	
	@SuppressWarnings("unused")
	private ModEntities entity;

//===============================================================================================================================================================================================\\
																										//Inits\\
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
		sounds = new ModSoundEvent();
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModItems.initRecipes();
		ModBlocks.initRecipes();
		entity = new ModEntities();
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);  //Register the ore generator
		
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
//===============================================================================================================================================================================================\\
}
