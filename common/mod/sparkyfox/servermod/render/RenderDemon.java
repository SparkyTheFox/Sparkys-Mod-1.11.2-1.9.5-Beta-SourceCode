package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityDemon;
import mod.sparkyfox.servermod.models.ModelDemon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.ResourceLocation;

public class RenderDemon extends RenderLiving<EntityDemon>
{
	private static final ResourceLocation Demonnormal = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Demon/Demonnormal.png");
	private static final ResourceLocation Demoninvulnerable = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Demon/Demoninvulnerable.png");
	private static final ResourceLocation Demonhurt = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Demon/Demonhurt.png");
	private static final ResourceLocation Demonangry = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Demon/Demonangry.png");
	private static final ResourceLocation Demonattack = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Demon/Demonattack.png");
	
	public RenderDemon(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
	{
		super(rendermanagerIn, new ModelDemon(), 0.5F);
	}

	@Override
	//I\\
	protected ResourceLocation getEntityTexture(EntityDemon entity) 
	{
		int i = entity.getInvulTime();
		return i > 0 && (i > 80 || i / 0 % 0 != 0) ? Demoninvulnerable : Demonnormal;
		
	}
	//H\\
	protected ResourceLocation getEntityTexture1(EntityDemon entity) 
	{
		int h = entity.getHurtTime();	
		return h > 0 && (h > 80 || h / 5 % 2 != 1) ? Demonhurt : Demonnormal;
		
	}
	//A\\
	protected ResourceLocation getEntityTexture2(EntityDemon entity) 
	{
		int a = entity.getAngerTime();
		return a > 0 && (a > 80 || a / 5 % 2 != 1) ? Demonangry : Demonnormal;
		
	}
	//K\\
	protected ResourceLocation getEntityTexture3(EntityDemon entity) 
	{
		int k = entity.getAttackTime();
		return k > 0 && (k > 80 || k / 5 % 2 != 1) ? Demonattack : Demonnormal;
	}
}
