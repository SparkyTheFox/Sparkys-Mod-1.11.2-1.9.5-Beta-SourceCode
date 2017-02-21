package mod.sparkyfox.servermod;

import java.util.Random;

import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.init.ModSoundEvent;
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

@Mod(modid = ServerMod.MOD_ID,
	name = ServerMod.MOD_NAME,
	version = ServerMod.VERSION)
public class ServerMod {
	
	
	// Constants
	public static final String MOD_ID = "servermod";
	public static final String MOD_NAME = "Sparky's Mod";
	public static final String VERSION = "ALPHA";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; // servermod:

	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static ServerMod instance;
	
	@SidedProxy(clientSide = "mod.sparkyfox.servermod.ClientProxy", serverSide = "mod.sparkyfox.servermod.CommonProxy")
	public static CommonProxy proxy;
	@SuppressWarnings("unused")
	private ModSoundEvent sounds;
	@SuppressWarnings("unused")
	private EntitySMGRounds entity;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event); 
		sounds = new ModSoundEvent();
		
		
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event); 
		
		
		
		
		
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.postInit(event); 
		
		
		
	}

}
