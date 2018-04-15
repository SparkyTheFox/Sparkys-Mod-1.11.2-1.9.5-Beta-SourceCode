 package mod.sparkyfox.servermod.render;
 
 import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.tiles.TileBlood;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
 
 
 public class RenderBlood extends TileEntitySpecialRenderer {
	 
   private static final ResourceLocation resource = new ResourceLocation(ServerMod.MOD_ID, "textures/blocks/blood_block_0.png");
   private static final ResourceLocation resource1 = new ResourceLocation(ServerMod.MOD_ID, "textures/blocks/blood_block_1.png");
   private static final ResourceLocation resource2 = new ResourceLocation(ServerMod.MOD_ID, "textures/blocks/blood_block_2.png");

   
   public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialTicks, int destroyStage)
   {
     TileBlood blood = (TileBlood)tile;
     GlStateManager.disableCull();
     GlStateManager.disableBlend();
     GlStateManager.depthMask(true);
     GlStateManager.disableRescaleNormal();
     GlStateManager.enableAlpha();
     GlStateManager.disableLighting();
     
     VertexBuffer tessellator = Tessellator.getInstance().getBuffer();
     tessellator.begin(7, DefaultVertexFormats.POSITION_TEX);
     
     if (tile != null) {
       int meta = tile.getBlockMetadata();
       if (meta == 1) {
         bindTexture(resource1);
       } else if (meta == 2) {
         bindTexture(resource2);
       } else {
         bindTexture(resource);
       }
     } else {
       bindTexture(resource);
     }
     GlStateManager.pushMatrix();
     GlStateManager.translate(x, y, z);
     int i = 0;int j = 1;int k = 1;
     if (blood != null) {
       if (blood.rotation == 1) {
         i = -1;
         j = 0;
         k = -1;
       }
       else if (blood.rotation == 2) {
         j = -1;
         k = -1;
       }
       else if (blood.rotation == 3) {
         i = 1;
         j = 0;
         k = 1;
       }
       if (!blood.hideSouth) {
         tessellator.pos(0.0D, 0.0D, 0.99D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(0.0D, 1.0D, 0.99D).tex(i, j).endVertex();
         tessellator.pos(1.0D, 1.0D, 0.99D).tex(k, k).endVertex();
         tessellator.pos(1.0D, 0.0D, 0.99D).tex(j, i).endVertex();
       }
       if (!blood.hideNorth) {
         tessellator.pos(0.0D, 0.0D, 0.01D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(0.0D, 1.0D, 0.01D).tex(i, j).endVertex();
         tessellator.pos(1.0D, 1.0D, 0.01D).tex(k, k).endVertex();
         tessellator.pos(1.0D, 0.0D, 0.01D).tex(j, i).endVertex();
       }
       if (!blood.hideEast) {
         tessellator.pos(0.99D, 0.0D, 0.0D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(0.99D, 1.0D, 0.0D).tex(i, j).endVertex();
         tessellator.pos(0.99D, 1.0D, 1.0D).tex(k, k).endVertex();
         tessellator.pos(0.99D, 0.0D, 1.0D).tex(j, i).endVertex();
       }
       if (!blood.hideWest) {
         tessellator.pos(0.01D, 0.0D, 0.0D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(0.01D, 1.0D, 0.0D).tex(i, j).endVertex();
         tessellator.pos(0.01D, 1.0D, 1.0D).tex(k, k).endVertex();
         tessellator.pos(0.01D, 0.0D, 1.0D).tex(j, i).endVertex();
       }
       if (!blood.hideBottom) {
         tessellator.pos(0.0D, 0.01D, 0.0D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(1.0D, 0.01D, 0.0D).tex(i, j).endVertex();
         tessellator.pos(1.0D, 0.01D, 1.0D).tex(k, k).endVertex();
         tessellator.pos(0.0D, 0.01D, 1.0D).tex(j, i).endVertex();
       }
       if (!blood.hideTop) {
         tessellator.pos(0.0D, 0.99D, 0.0D).tex(0.0D, 0.0D).endVertex();
         tessellator.pos(1.0D, 0.99D, 0.0D).tex(i, j).endVertex();
         tessellator.pos(1.0D, 0.99D, 1.0D).tex(k, k).endVertex();
         tessellator.pos(0.0D, 0.99D, 1.0D).tex(j, i).endVertex();
       }
     }
     
     Tessellator.getInstance().draw();
     GlStateManager.enableTexture2D();
     GlStateManager.depthMask(true);
     GlStateManager.popMatrix();
     GlStateManager.disableAlpha();
     GlStateManager.enableLighting();
   }
 }
