package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
//import mod.sparkyfox.servermod.entity.EntityFlowey;
//import mod.sparkyfox.servermod.entity.EntityFriendlynessPellet;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	public static int AK4URounds = 1;
	//public static int Flowey = 2;
	//public static int FriendlynessPellet = 3;
	

	public ModEntities() {
		registerEntity();
		registerRender();

	}

	public static void registerEntity() {
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:SMGRounds") , EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:AK4URounds") , EntityAK4URounds.class, "AK4URounds", AK4URounds, ServerMod.instance, 64, 1, true);
		//EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:Flowey") , EntityFlowey.class, "Flowey", Flowey, ServerMod.instance, 64, 1, true, 0xffff00, 0x32cd32);
		//EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:FriendlynessPellet") , EntityFriendlynessPellet.class, "FriendlynessPellet", FriendlynessPellet, ServerMod.instance, 64, 1, true);
		//EntityRegistry.addSpawn(EntityFlowey.class, 10000, 1, 1, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
				//Biomes.PLAINS, Biomes.ROOFED_FOREST, Biomes.HELL, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_BIRCH_FOREST, Biomes.FOREST_HILLS);
		
	}
	
	public static void registerRender()
	
	{
	
		//RenderingRegistry.registerEntityRenderingHandler(EntityFlowey.class, new RenderFlowey(Minecraft.getMinecraft().getRenderManager(), new ModelFlowey(), 0.5F));
		//RenderingRegistry.registerEntityRenderingHandler(EntityFriendlynessPellet.class, new RenderFriendlynessPellet(Minecraft.getMinecraft().getRenderManager()));
	}
	
}

//FFFF00
//32CD3
