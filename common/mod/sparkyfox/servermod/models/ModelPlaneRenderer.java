/*     */ package mod.sparkyfox.servermod.models;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelBox;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.model.PositionTextureVertex;
/*     */ import net.minecraft.client.model.TexturedQuad;
/*     */ import net.minecraft.client.renderer.VertexBuffer;
/*     */ 
/*     */ public class ModelPlaneRenderer extends ModelRenderer
/*     */ {
/*     */   private int textureOffsetX;
/*     */   private int textureOffsetY;

/*     */   
/*     */   public ModelPlaneRenderer(ModelBase modelbase, int i, int j)
/*     */   {
/*  18 */     super(modelbase, i, j);
/*  19 */     this.textureOffsetX = i;
/*  20 */     this.textureOffsetY = j;
/*     */   }
/*     */   
/*     */   public void addBackPlane(float f, float f1, float f2, int i, int j)
/*     */   {
/*  25 */     addPlane(f, f1, f2, i, j, 0, 0.0F, EnumPlanePosition.BACK);
/*     */   }
/*     */   
/*     */   public void addSidePlane(float f, float f1, float f2, int j, int k)
/*     */   {
/*  30 */     addPlane(f, f1, f2, 0, j, k, 0.0F, EnumPlanePosition.LEFT);
/*     */   }
/*     */   
/*     */   public void addTopPlane(float f, float f1, float f2, int i, int k)
/*     */   {
/*  35 */     addPlane(f, f1, f2, i, 0, k, 0.0F, EnumPlanePosition.TOP);
/*     */   }
/*     */   
/*     */   public void addBackPlane(float f, float f1, float f2, int i, int j, float scale)
/*     */   {
/*  40 */     addPlane(f, f1, f2, i, j, 0, scale, EnumPlanePosition.BACK);
/*     */   }
/*     */   
/*     */   public void addSidePlane(float f, float f1, float f2, int j, int k, float scale)
/*     */   {
/*  45 */     addPlane(f, f1, f2, 0, j, k, scale, EnumPlanePosition.LEFT);
/*     */   }
/*     */   
/*     */   public void addTopPlane(float f, float f1, float f2, int i, int k, float scale)
/*     */   {
/*  50 */     addPlane(f, f1, f2, i, 0, k, scale, EnumPlanePosition.TOP);
/*     */   }
/*     */   
/*     */   public void addPlane(float par1, float par2, float par3, int par4, int par5, int par6, float f3, EnumPlanePosition pos) {
/*  54 */     this.cubeList.add(new ModelPlane(this, this.textureOffsetX, this.textureOffsetY, par1, par2, par3, par4, par5, par6, f3, pos));
/*     */   }
/*     */   
/*     */   public static enum EnumPlanePosition {
/*  58 */     TOP,  BOTTOM,  RIGHT,  LEFT,  FRONT,  BACK;
/*     */     
/*     */     private EnumPlanePosition() {}
/*     */   }
/*     */   
/*     */   public class ModelPlane extends ModelBox {
/*     */     private PositionTextureVertex[] vertexPositions;
/*     */     private TexturedQuad quad;
/*     */     
/*     */     public ModelPlane(ModelRenderer par1ModelRenderer, int textureOffsetX, int textureOffsetY, float par4, float par5, float par6, int par7, int par8, int par9, float par10, ModelPlaneRenderer.EnumPlanePosition position) {
/*  68 */       super(par1ModelRenderer, textureOffsetX, textureOffsetY, par4, par5, par6, par7, par8, par9, par10);
/*     */       
/*  70 */       this.vertexPositions = new PositionTextureVertex[8];
/*  71 */       float var11 = par4 + par7;
/*  72 */       float var12 = par5 + par8;
/*  73 */       float var13 = par6 + par9;
/*  74 */       par4 -= par10;
/*  75 */       par5 -= par10;
/*  76 */       par6 -= par10;
/*  77 */       var11 += par10;
/*  78 */       var12 += par10;
/*  79 */       var13 += par10;
/*     */       
/*  81 */       if (par1ModelRenderer.mirror)
/*     */       {
/*  83 */         float var14 = var11;
/*  84 */         var11 = par4;
/*  85 */         par4 = var14;
/*     */       }
/*     */       
/*  88 */       PositionTextureVertex var23 = new PositionTextureVertex(par4, par5, par6, 0.0F, 0.0F);
/*  89 */       PositionTextureVertex var15 = new PositionTextureVertex(var11, par5, par6, 0.0F, 8.0F);
/*  90 */       PositionTextureVertex var16 = new PositionTextureVertex(var11, var12, par6, 8.0F, 8.0F);
/*  91 */       PositionTextureVertex var17 = new PositionTextureVertex(par4, var12, par6, 8.0F, 0.0F);
/*  92 */       PositionTextureVertex var18 = new PositionTextureVertex(par4, par5, var13, 0.0F, 0.0F);
/*  93 */       PositionTextureVertex var19 = new PositionTextureVertex(var11, par5, var13, 0.0F, 8.0F);
/*  94 */       PositionTextureVertex var20 = new PositionTextureVertex(var11, var12, var13, 8.0F, 8.0F);
/*  95 */       PositionTextureVertex var21 = new PositionTextureVertex(par4, var12, var13, 8.0F, 0.0F);
/*  96 */       this.vertexPositions[0] = var23;
/*  97 */       this.vertexPositions[1] = var15;
/*  98 */       this.vertexPositions[2] = var16;
/*  99 */       this.vertexPositions[3] = var17;
/* 100 */       this.vertexPositions[4] = var18;
/* 101 */       this.vertexPositions[5] = var19;
/* 102 */       this.vertexPositions[6] = var20;
/* 103 */       this.vertexPositions[7] = var21;
/*     */       
/* 105 */       if (position == ModelPlaneRenderer.EnumPlanePosition.LEFT) {
/* 106 */         this.quad = new TexturedQuad(new PositionTextureVertex[] { var19, var15, var16, var20 }, textureOffsetX, textureOffsetY, textureOffsetX + par9, textureOffsetY + par8, par1ModelRenderer.textureWidth, par1ModelRenderer.textureHeight);
/*     */       }
/*     */       
/* 109 */       if (position == ModelPlaneRenderer.EnumPlanePosition.TOP) {
/* 110 */         this.quad = new TexturedQuad(new PositionTextureVertex[] { var19, var18, var23, var15 }, textureOffsetX, textureOffsetY, textureOffsetX + par7, textureOffsetY + par9, par1ModelRenderer.textureWidth, par1ModelRenderer.textureHeight);
/*     */       }
/*     */       
/* 113 */       if (position == ModelPlaneRenderer.EnumPlanePosition.BACK) {
/* 114 */         this.quad = new TexturedQuad(new PositionTextureVertex[] { var15, var23, var17, var16 }, textureOffsetX, textureOffsetY, textureOffsetX + par7, textureOffsetY + par8, par1ModelRenderer.textureWidth, par1ModelRenderer.textureHeight);
/*     */       }
/*     */       
/* 117 */       if (par1ModelRenderer.mirror) {
/* 118 */         this.quad.flipFace();
/*     */       }
/*     */     }
/*     */     
/*     */     public void render(VertexBuffer par1Tessellator, float par2)
/*     */     {
/* 124 */       this.quad.draw(par1Tessellator, par2);
/*     */     }
/*     */   }
/*     */ }

