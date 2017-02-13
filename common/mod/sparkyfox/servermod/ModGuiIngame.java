package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ModGuiIngame extends GuiIngame{
	
	protected static final ResourceLocation HELMET_BLUR_TEX_PATH = new ResourceLocation("textures/misc/helmetblur.png");

	
	public ModGuiIngame(Minecraft mcIn) {
		super(mcIn);
		// TODO Auto-generated constructor stub
	}

	public void renderGameOverlay(float partialTicks)
{
    ScaledResolution scaledresolution = new ScaledResolution(this.mc);
    int i = scaledresolution.getScaledWidth();
    int j = scaledresolution.getScaledHeight();
    FontRenderer fontrenderer = this.getFontRenderer();
    GlStateManager.enableBlend();

    if (Minecraft.isFancyGraphicsEnabled())
    {
        this.renderVignette(this.mc.player.getBrightness(partialTicks), scaledresolution);
    }
    else
    {
        GlStateManager.enableDepth();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    }

    ItemStack itemstack = this.mc.player.inventory.armorItemInSlot(3);

    if (this.mc.gameSettings.thirdPersonView == 0 && itemstack.getItem() == ModItems.getItemFromModItem(ModItems.OdstHelmet))
    {
        this.renderHelmetOverlay(scaledresolution); }
    }
    
    protected void renderHelmetOverlay(ScaledResolution scaledRes)
    {
        GlStateManager.disableDepth();
        GlStateManager.depthMask(false);
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.disableAlpha();
        this.mc.getTextureManager().bindTexture(HELMET_BLUR_TEX_PATH);
        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer vertexbuffer = tessellator.getBuffer();
        vertexbuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
        vertexbuffer.pos(0.0D, (double)scaledRes.getScaledHeight(), -90.0D).tex(0.0D, 1.0D).endVertex();
        vertexbuffer.pos((double)scaledRes.getScaledWidth(), (double)scaledRes.getScaledHeight(), -90.0D).tex(1.0D, 1.0D).endVertex();
        vertexbuffer.pos((double)scaledRes.getScaledWidth(), 0.0D, -90.0D).tex(1.0D, 0.0D).endVertex();
        vertexbuffer.pos(0.0D, 0.0D, -90.0D).tex(0.0D, 0.0D).endVertex();
        tessellator.draw();
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
}
	
}
	