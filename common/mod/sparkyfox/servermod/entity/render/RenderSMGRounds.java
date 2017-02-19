package mod.sparkyfox.servermod.entity.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSMGRounds extends RenderArrow<EntitySMGRounds> {
	public static final ResourceLocation SMGRounds = new ResourceLocation(ServerMod.MOD_ID + ":textures/entity/smgrounds.png");

	public RenderSMGRounds(RenderManager p_i46549_1_) {
		super(p_i46549_1_);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntitySMGRounds entity) {
		return SMGRounds;
	}
}
