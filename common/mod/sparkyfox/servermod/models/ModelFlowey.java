package mod.sparkyfox.servermod.models;

import mod.sparkyfox.servermod.init.ModModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFlowey extends ModelBase implements ModModels
{
  //fields
    ModelRenderer Head;
    ModelRenderer PetalTopRight;
    ModelRenderer PetalTopLeft;
    ModelRenderer PetalBottomRight;
    ModelRenderer PetalBottomLeft;
    ModelRenderer PetalRight;
    ModelRenderer PetalLeft;
    ModelRenderer Body;
  
  public ModelFlowey()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 7);
      Head.addBox(0F, 0F, 0F, 8, 8, 1);
      Head.setRotationPoint(-4F, 6F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      PetalTopRight = new ModelRenderer(this, 10, 0);
      PetalTopRight.addBox(-2F, 0F, 0F, 4, 6, 1);
      PetalTopRight.setRotationPoint(6F, 3F, 2F);
      PetalTopRight.setTextureSize(64, 32);
      PetalTopRight.mirror = true;
      setRotation(PetalTopRight, -0.2617994F, 0F, 0.6981317F);
      PetalTopLeft = new ModelRenderer(this, 0, 0);
      PetalTopLeft.addBox(-2F, 0F, 0F, 4, 6, 1);
      PetalTopLeft.setRotationPoint(-6F, 3F, 2F);
      PetalTopLeft.setTextureSize(64, 32);
      PetalTopLeft.mirror = true;
      setRotation(PetalTopLeft, -0.2617994F, 0F, -0.6981317F);
      PetalBottomRight = new ModelRenderer(this, 50, 0);
      PetalBottomRight.addBox(-2F, 0F, 0F, 4, 6, 1);
      PetalBottomRight.setRotationPoint(2F, 13F, 0F);
      PetalBottomRight.setTextureSize(64, 32);
      PetalBottomRight.mirror = true;
      setRotation(PetalBottomRight, 0.2617994F, 0F, -0.6981317F);
      PetalBottomLeft = new ModelRenderer(this, 40, 0);
      PetalBottomLeft.addBox(-2F, 0F, 0F, 4, 6, 1);
      PetalBottomLeft.setRotationPoint(-2F, 13F, 0F);
      PetalBottomLeft.setTextureSize(64, 32);
      PetalBottomLeft.mirror = true;
      setRotation(PetalBottomLeft, 0.2617994F, 0F, 0.6981317F);
      PetalRight = new ModelRenderer(this, 30, 0);
      PetalRight.addBox(0F, 0F, 0F, 4, 6, 1);
      PetalRight.setRotationPoint(3F, 12F, 0F);
      PetalRight.setTextureSize(64, 32);
      PetalRight.mirror = true;
      setRotation(PetalRight, 0.2617994F, 0F, -1.570796F);
      PetalLeft = new ModelRenderer(this, 20, 0);
      PetalLeft.addBox(0F, 0F, 0F, 4, 6, 1);
      PetalLeft.setRotationPoint(-3F, 8F, 0F);
      PetalLeft.setTextureSize(64, 32);
      PetalLeft.mirror = true;
      setRotation(PetalLeft, 0.2617994F, 0F, 1.570796F);
      Body = new ModelRenderer(this, 0, 16);
      Body.addBox(0F, 0F, 0F, 1, 12, 1);
      Body.setRotationPoint(-0.5F, 14F, 0.5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0.7853982F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    PetalTopRight.render(f5);
    PetalTopLeft.render(f5);
    PetalBottomRight.render(f5);
    PetalBottomLeft.render(f5);
    PetalRight.render(f5);
    PetalLeft.render(f5);
    Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
}


		@Override
		public void registerModels() {
			// TODO Auto-generated method stub
			
		}
}