package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.entity.render.RenderSMGRounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntity {
	
	public static int SMGRounds = 0;

	public static final void init() {
		
	}

	private static void initTools() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public static final void registerRenders() {
	
	}

	@SideOnly(Side.CLIENT)
	private static void registerRendersSMGRounds() {
		EntityRegistry.registerModEntity(new ResourceLocation(ServerMod.MOD_ID, "SMGRounds"), EntitySMGRounds.class, "SMGRounds", 100, ServerMod.instance, 80, 10, true);
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		RenderingRegistry.registerEntityRenderingHandler(EntitySMGRounds.class, new RenderSMGRounds(rm));
	}

}
