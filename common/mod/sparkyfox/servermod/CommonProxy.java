package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
		
		
	}

	public void init(FMLInitializationEvent event) {
		ModItems.initRecipes();

		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
