/**
package mod.sparkyfox.servermod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFriendlynessPellet extends ModelBase
{  //fields
    ModelRenderer FriendlynessPelletMain;
    ModelRenderer FriendlynessPellet1;
    ModelRenderer FriendlynessPelle2;
  
  public ModelFriendlynessPellet()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      FriendlynessPelletMain = new ModelRenderer(this, 0, 0);
      FriendlynessPelletMain.addBox(-3.5F, -3.5F, -3.5F, 7, 7, 7);
      FriendlynessPelletMain.setRotationPoint(0F, 0F, 0F);
      FriendlynessPelletMain.setTextureSize(64, 32);
      FriendlynessPelletMain.mirror = true;
      setRotation(FriendlynessPelletMain, 0.7853982F, 0F, 0.7853982F);
      FriendlynessPellet1 = new ModelRenderer(this, 0, 15);
      FriendlynessPellet1.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
      FriendlynessPellet1.setRotationPoint(6F, 0F, 0F);
      FriendlynessPellet1.setTextureSize(64, 32);
      FriendlynessPellet1.mirror = true;
      setRotation(FriendlynessPellet1, 0.7853982F, 0F, 0.7853982F);
      FriendlynessPelle2 = new ModelRenderer(this, 21, 15);
      FriendlynessPelle2.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
      FriendlynessPelle2.setRotationPoint(-6F, 0F, 0F);
      FriendlynessPelle2.setTextureSize(64, 32);
      FriendlynessPelle2.mirror = true;
      setRotation(FriendlynessPelle2, 0.7853982F, 0F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    FriendlynessPelletMain.render(f5);
    FriendlynessPellet1.render(f5);
    FriendlynessPelle2.render(f5);
  }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }

    

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }


    		public void registerModels() {
    			// TODO Auto-generated method stub
    			
    		}
    }



*/