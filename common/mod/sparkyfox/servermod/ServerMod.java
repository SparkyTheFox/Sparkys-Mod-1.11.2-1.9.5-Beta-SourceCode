package mod.sparkyfox.servermod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.sparkyfox.servermod.entity.EntityMagicProjectile;
import mod.sparkyfox.servermod.entity.EntityProjectile;
import mod.sparkyfox.servermod.industrialFreezer.ModGuiHandler;
import mod.sparkyfox.servermod.init.ModArmors;
import mod.sparkyfox.servermod.init.ModEnchant;
import mod.sparkyfox.servermod.init.ModEntities;
import mod.sparkyfox.servermod.init.ModFunBlocks;
import mod.sparkyfox.servermod.init.ModFunItems;
import mod.sparkyfox.servermod.init.ModProps;
import mod.sparkyfox.servermod.init.ModSlab;
//import mod.sparkyfox.servermod.init.ModSlabs;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.init.ModStairs;
import mod.sparkyfox.servermod.init.ModTools;
import mod.sparkyfox.servermod.init.ModWeapons;
import mod.sparkyfox.servermod.lib.OreDictionaryHandler;
import mod.sparkyfox.servermod.lib.OreRecipeHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = ServerMod.MOD_ID,
	name = ServerMod.MOD_NAME,
	version = ServerMod.VERSION)
public class ServerMod {
	
//===============================================================================================================================================================================================\\
																									//Mod Info\\	
	
	public static final String MOD_ID = "servermod";
	public static final String MOD_NAME = "Sparky's Mod";
	public static final String VERSION = "BETA-Technical Update";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; // servermod:
    public static final String CONFIG_FILE = "Servermod/servermod.conf";
	
//===============================================================================================================================================================================================\\
																									//Instances\\	
	@Instance(MOD_ID)
	public static ServerMod INSTANCE = new ServerMod();
	
	@Instance(MOD_ID)
	public static ServerMod instance;
	public static Logger Log = LogManager.getLogger();
//===============================================================================================================================================================================================\\	
																									//SidedProxy\\
	
	@SidedProxy(clientSide = "mod.sparkyfox.servermod.ClientProxy", serverSide = "mod.sparkyfox.servermod.CommonProxy")
	public static CommonProxy proxy;
	public static FMLEventChannel Channel;
//===============================================================================================================================================================================================\\
																									//Warnings\\
	
	@SuppressWarnings("unused")
	private ModSoundEvents sounds;
	
	@SuppressWarnings("unused")
	private ModEntities entity;
	
	private static int NewEntityStartId = 0;

//===============================================================================================================================================================================================\\
																									//Inits\\
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event); 
		sounds = new ModSoundEvents();
		Channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("servermod");
		ModSlab.init();
		ModSlab.register();
		
		ModProps.init();
		ModProps.register();
		
		ModStairs.init();
		ModStairs.register();
		
		ModTools.init();
		ModTools.register();
		
		ModFunItems.Load();
		ModWeapons.Load();
		ModArmors.Load();
		ModFunBlocks.Load();
		ModEnchant.load();
		
		proxy.registerRenderer();
		proxy.registerRenders();
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event); 
		registerNewEntity(EntityProjectile.class, "ModProjectile", 64, 3, true);
		registerNewEntity(EntityMagicProjectile.class, "ModMagicProjectile", 64, 3, true);

		
		/** CFM RecipieAPI */
		//FMLInterModComms.sendMessage("cfm", "register", "com.mrcrayfish.food.FurnitureRecipes.register");
		FMLInterModComms.sendMessage("cfm", "register", "mod.sparkyfox.servermod.lib.FurnitureRecipes.register");
		
		
		OreDictionaryHandler.registerOreDictionary();
		OreRecipeHandler.registerCraftingRecipes();
		OreRecipeHandler.registerFurnaceRecipes();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new ModGuiHandler());
		entity = new ModEntities();//this is causing the server side problem
		//if i take out "entity = new ModEntities();" and put in
		/**
		 *  ResourceLocation resourceLocation = new ResourceLocation(ServerMod.MOD_ID, "Flowey");
        EntityRegistry.registerModEntity(resourceLocation, EntityFlowey.class, resourceLocation.toString(), 0, ServerMod.instance, 64, 1, true, 0x000000, 0xFFFFFF);
		 */
		//This seems to fix the problem, BUT, all my other entities disappear and Floweys Spawn egg and Name changes.
		
	}   
	private void registerNewEntity(Class<? extends Entity> cl, String name, int range, int update, boolean velocity)
	{
		EntityRegistry.registerModEntity(new ResourceLocation("servermod", name), cl, name, NewEntityStartId++, this, range, update, velocity);
	}
	
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		//proxy.postInit(event); 
		proxy.registerModels();
		
        //Run stuff after mods have initialized here

       // ModSlabs.ITEMS = null;
	//	ModSlabs.BLOCKS = null;
//		ModSlabs.ITEM_BLOCKS = null;

			
	}
//===============================================================================================================================================================================================\\

}
