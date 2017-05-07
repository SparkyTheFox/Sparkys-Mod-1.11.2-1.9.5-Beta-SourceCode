package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityFlowey;
import mod.sparkyfox.servermod.models.ModelFlowey;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFlowey extends RenderLiving<EntityFlowey>
{
	private static final ResourceLocation Floweynormal = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Flowey/Floweynormal.png");
	private static final ResourceLocation Floweyinvulnerable = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Flowey/Floweyinvulnerable.png");
	private static final ResourceLocation Floweyhurt = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Flowey/Floweyhurt.png");
	private static final ResourceLocation Floweyangry = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Flowey/Floweyangry.png");
	private static final ResourceLocation Floweyattack = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/Flowey/Floweyattack.png");
	
	public RenderFlowey(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
	{
		super(rendermanagerIn, new ModelFlowey(), 0.5F);
	}

	@Override
	//I\\
	protected ResourceLocation getEntityTexture(EntityFlowey entity) 
	{
		int i = entity.getInvulTime();
		return i > 0 && (i > 80 || i / 0 % 0 != 0) ? Floweyinvulnerable : Floweynormal;
		
	}
	//H\\
	protected ResourceLocation getEntityTexture1(EntityFlowey entity) 
	{
		int h = entity.getHurtTime();	
		return h > 0 && (h > 80 || h / 5 % 2 != 1) ? Floweyhurt : Floweynormal;
		
	}
	//A\\
	protected ResourceLocation getEntityTexture2(EntityFlowey entity) 
	{
		int a = entity.getAngerTime();
		return a > 0 && (a > 80 || a / 5 % 2 != 1) ? Floweyangry : Floweynormal;
		
	}
	//K\\
	protected ResourceLocation getEntityTexture3(EntityFlowey entity) 
	{
		int k = entity.getAttackTime();
		return k > 0 && (k > 80 || k / 5 % 2 != 1) ? Floweyattack : Floweynormal;
	}
}
