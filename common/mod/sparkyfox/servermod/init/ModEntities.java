package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.entity.EntityDemon;
import mod.sparkyfox.servermod.entity.EntityDemonPellet;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.models.ModelDemon;
import mod.sparkyfox.servermod.models.ModelDemonPellet;
import mod.sparkyfox.servermod.render.RenderDemon;
import mod.sparkyfox.servermod.render.RenderDemonPellet;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	public static int AK4URounds = 1;
	public static int Demon = 2;
	public static int DemonPellet = 3;
	

	public ModEntities() {
		registerEntity();
		registerRender();

	}

	public static void registerEntity() {
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:SMGRounds") , EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:AK4URounds") , EntityAK4URounds.class, "AK4URounds", AK4URounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:Demon") , EntityDemon.class, "Demon", Demon, ServerMod.instance, 64, 1, true, 0xffff00, 0x32cd32);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:DemonPellet") , EntityDemonPellet.class, "DemonPellet", DemonPellet, ServerMod.instance, 64, 1, true);
		EntityRegistry.addSpawn(EntityDemon.class, 10000, 1, 1, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
				Biomes.PLAINS, Biomes.ROOFED_FOREST, Biomes.HELL, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_BIRCH_FOREST, Biomes.FOREST_HILLS);
		
	}
	
	public static void registerRender()
	
	{
	
		RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, new RenderDemon(Minecraft.getMinecraft().getRenderManager(), new ModelDemon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDemonPellet.class, new RenderDemonPellet(Minecraft.getMinecraft().getRenderManager()));
	}
	
}

//FFFF00
//32CD3

//ResourceLocation resourceLocation = new ResourceLocation(ServerMod.MOD_ID, "Demon");
//EntityRegistry.registerModEntity(resourceLocation, EntityDemon.class, resourceLocation.toString(), 0, ServerMod.instance, 64, 1, true, 0x000000, 0xFFFFFF);

