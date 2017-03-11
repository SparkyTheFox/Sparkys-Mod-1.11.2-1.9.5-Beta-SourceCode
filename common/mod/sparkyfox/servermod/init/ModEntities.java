package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.entity.EntityFlowey;
import mod.sparkyfox.servermod.entity.EntityFriendlynessPellet;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.models.ModelFlowey;
import mod.sparkyfox.servermod.models.ModelFriendlynessPellet;
import mod.sparkyfox.servermod.render.RenderFlowey;
import mod.sparkyfox.servermod.render.RenderFriendlynessPellet;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	public static int AK4URounds = 1;
	public static int Flowey = 2;
	public static int FriendlynessPellet = 3;
	

	public ModEntities() {
		register();
		ModEntities.registerRender();
		
		
	}

	public void register() {
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntitySMGRounds") , EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntityAK4URounds") , EntityAK4URounds.class, "AK4URounds", AK4URounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntityFlowey") , EntityFlowey.class, "Flowey", Flowey, ServerMod.instance, 64, 1, true, 0xffff00, 0x32cd32);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:FriendlynessPellet") , EntityFriendlynessPellet.class, "FriendlynessPellet", FriendlynessPellet, ServerMod.instance, 64, 1, true);
		
	}
	
	public static void registerRender()
	
	{
	
		RenderingRegistry.registerEntityRenderingHandler(EntityFlowey.class, new RenderFlowey(Minecraft.getMinecraft().getRenderManager(), new ModelFlowey(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFriendlynessPellet.class, new RenderFriendlynessPellet(Minecraft.getMinecraft().getRenderManager()));
	}

	
	}
