/**
package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityFlowey;
import mod.sparkyfox.servermod.entity.EntityFriendlynessPellet;
import mod.sparkyfox.servermod.models.ModelFlowey;
import mod.sparkyfox.servermod.models.ModelFriendlynessPellet;
import mod.sparkyfox.servermod.render.RenderFlowey;
import mod.sparkyfox.servermod.render.RenderFriendlynessPellet;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	
	
	public static void register()
	{
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
	}
	
	public static void registerRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFlowey.class, new RenderFlowey(Minecraft.getMinecraft().getRenderManager(), new ModelFlowey(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFriendlynessPellet.class, new RenderFriendlynessPellet(Minecraft.getMinecraft().getRenderManager()));
	}
	
	public static void registerEntity()
	{
		EntityRegistry.registerModEntity(null, EntityFlowey.class, "Flowey", 300, ServerMod.instance, 64, 1, true, 0xffff00, 0x32cd32);
		EntityRegistry.registerModEntity(null, EntityFriendlynessPellet.class, "FriendlynessPellet", 300, ServerMod.instance, 64, 1, true);
	}
}
//FFFF00
//32CD3

*/
