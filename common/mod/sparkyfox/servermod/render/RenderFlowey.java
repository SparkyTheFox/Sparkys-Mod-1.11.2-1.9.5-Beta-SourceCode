package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityFlowey;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlowey extends RenderLiving<EntityFlowey>
{
	private static final ResourceLocation floweynormal = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweynormal.png");
	private static final ResourceLocation floweyangry = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweyangry.png");
	private static final ResourceLocation floweyattack = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweyattack.png");
	
	public RenderFlowey(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
	{
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFlowey entity) 
	{
		 return entity.isAttacking() ? floweyattack : entity.isAngry() ? floweyangry : floweynormal; 
	}

}
