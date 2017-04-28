package mod.sparkyfox.servermod;

import java.util.Random;

import mod.sparkyfox.servermod.init.ModEntities;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//===========================================================================================================================================================================================\\	
																									//Main Class\\

@Mod(modid = ServerMod.MOD_ID,
	name = ServerMod.MOD_NAME,
	version = ServerMod.VERSION)
public class ServerMod {
	
//===============================================================================================================================================================================================\\
																									//Mod Info\\	
	
	public static final String MOD_ID = "servermod";
	public static final String MOD_NAME = "Sparky's Mod";
	public static final String VERSION = "BETA";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; // servermod:
	
//===============================================================================================================================================================================================\\
																									//Instances\\	
	@Instance(MOD_ID)
	public static ServerMod INSTANCE = new ServerMod();
	
	@Instance(MOD_ID)
	public static ServerMod instance;
	
//===============================================================================================================================================================================================\\	
																									//SidedProxy\\
	
	@SidedProxy(clientSide = "mod.sparkyfox.servermod.ClientProxy", serverSide = "mod.sparkyfox.servermod.CommonProxy")
	public static CommonProxy proxy;
	
//===============================================================================================================================================================================================\\
																									//Warnings\\
	
	@SuppressWarnings("unused")
	private ModSoundEvents sounds;
	
	@SuppressWarnings("unused")
	private ModEntities entity;

//===============================================================================================================================================================================================\\
																									//Inits\\
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event); 
		sounds = new ModSoundEvents();
		proxy.registerRenderer();
		
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event); 
		entity = new ModEntities();//this is causing the server side problem
		//if i take out "entity = new ModEntities();" and put in
		/**
		 *  ResourceLocation resourceLocation = new ResourceLocation(ServerMod.MOD_ID, "Demon");
        EntityRegistry.registerModEntity(resourceLocation, EntityDemon.class, resourceLocation.toString(), 0, ServerMod.instance, 64, 1, true, 0x000000, 0xFFFFFF);
		 */
		//This seems to fix the problem, BUT, all my other entities disappear and Demons Spawn egg and Name changes.
	
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.postInit(event); 
		proxy.registerModels();
			
	}
//===============================================================================================================================================================================================\\

}
