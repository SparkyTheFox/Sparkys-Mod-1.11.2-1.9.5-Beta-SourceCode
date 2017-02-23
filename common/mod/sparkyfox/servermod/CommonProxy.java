package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModEntities;
import mod.sparkyfox.servermod.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		
	}

	public void init(FMLInitializationEvent event) {
		ModItems.initRecipes();
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
