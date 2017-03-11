package mod.sparkyfox.servermod.render;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityFriendlynessPellet;
import mod.sparkyfox.servermod.models.ModelFriendlynessPellet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFriendlynessPellet extends Render<EntityFriendlynessPellet>
{
	private static final ResourceLocation Invulnerable_Friendlyness_Pellet = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/friendlynesspellet_invulnerable.png");
	private static final ResourceLocation Friendlyness_Pellet = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/flowey/friendlynesspellet.png");
	
	
    /** The Skeleton's head model. */
    private final ModelFriendlynessPellet FriendlynessPelletModel = new ModelFriendlynessPellet();

    public RenderFriendlynessPellet(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
    }

    private float getRenderYaw(float p_82400_1_, float p_82400_2_, float p_82400_3_)
    {
        float f;

        for (f = p_82400_2_ - p_82400_1_; f < -180.0F; f += 360.0F)
        {
            ;
        }

        while (f >= 180.0F)
        {
            f -= 360.0F;
        }

        return p_82400_1_ + p_82400_3_ * f;
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityFriendlynessPellet entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        float f = this.getRenderYaw(entity.prevRotationYaw, entity.rotationYaw, partialTicks);
        float f1 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
        GlStateManager.translate((float)x, (float)y, (float)z);
        float f2 = 0.0625F;
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        GlStateManager.enableAlpha();
        this.bindEntityTexture(entity);

        if (this.renderOutlines)
        {
            GlStateManager.enableColorMaterial();
            GlStateManager.enableOutlineMode(this.getTeamColor(entity));
        }

        this.FriendlynessPelletModel.render(entity, 0.0F, 0.0F, 0.0F, f, f1, 0.0625F);

        if (this.renderOutlines)
        {
            GlStateManager.disableOutlineMode();
            GlStateManager.disableColorMaterial();
        }

        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityFriendlynessPellet entity)
    {
    	return entity.isInvulnerable() ? Invulnerable_Friendlyness_Pellet : Friendlyness_Pellet;
    }
}