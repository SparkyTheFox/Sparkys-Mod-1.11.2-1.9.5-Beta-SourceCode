package mod.sparkyfox.servermod.render;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSMGRounds extends RenderArrow<EntitySMGRounds> {

    private static final ResourceLocation SMGRounds = new ResourceLocation(ServerMod.MOD_ID, "textures/entity/projectiles/smgrounds.png");

    public RenderSMGRounds(RenderManager rm) {
        super(rm);
    }

    @Override
    public ResourceLocation getEntityTexture(@Nonnull EntitySMGRounds entity) {
        return SMGRounds;
    }

}