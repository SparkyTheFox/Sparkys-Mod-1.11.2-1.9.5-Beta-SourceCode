package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.world.WorldGenOre;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
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

	public void registerEventHandler() {
	}

//===============================================================================================================================================================================================\\
																										//Inits\\
	
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
//===============================================================================================================================================================================================\\

	public void registerRenders()
	{

	}

	public World getClientWorld()
	{
		return null;
	}

	public EntityPlayer getClientPlayer()
	{
		return null;
	}

	public boolean isSinglePlayer()
	{
		return false;
	}

	public boolean isDedicatedServer()
	{
		return true;
	}

	public void preInit() {
		// TODO Auto-generated method stub
		
	}
}
