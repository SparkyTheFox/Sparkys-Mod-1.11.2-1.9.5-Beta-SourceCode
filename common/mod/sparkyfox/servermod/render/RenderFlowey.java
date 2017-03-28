/**
package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityFlowey;
import mod.sparkyfox.servermod.models.ModelFlowey;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.ResourceLocation;

public class RenderFlowey extends RenderLiving<EntityFlowey>
{
	private static final ResourceLocation floweynormal = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweynormal.png");
	private static final ResourceLocation floweyangry = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweyangry.png");
	private static final ResourceLocation floweyattack = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweyattack.png");
	private static final ResourceLocation floweyinvulnerable = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/floweyattack.png");
	public RenderFlowey(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
	{
		super(rendermanagerIn, new ModelFlowey(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFlowey entity) 
	{
		int i = entity.getInvulTime();
		//int a = entity.getAngryTime();
		//int k = entity.getAttackTime();
	
		 return i > 0 && (i > 80 || i / 0 % 0 != 0) ? floweyinvulnerable : entity.isAttacking() ? floweyattack : entity.isAngry() ? floweyangry : floweynormal; 
	}

}
*/