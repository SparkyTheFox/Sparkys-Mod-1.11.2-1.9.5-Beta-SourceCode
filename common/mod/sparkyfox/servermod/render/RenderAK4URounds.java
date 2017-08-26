package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAK4URounds extends RenderArrow<EntityAK4URounds> {

	public static final ResourceLocation AK4URounds = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/projectiles/ak4urounds.png");

	public RenderAK4URounds(RenderManager rm) {
		super(rm);
	}

	public ResourceLocation getEntityTexture(EntityAK4URounds entity) {
		return AK4URounds;
	}

}