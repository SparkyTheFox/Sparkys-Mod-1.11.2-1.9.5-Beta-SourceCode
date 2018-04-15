/*    */ package mod.sparkyfox.servermod.item.magic;
/*    */ 
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ 
/*    */ public class EntityElementalStaffFX extends net.minecraft.client.particle.ParticlePortal
/*    */ {
/*    */   double x;
/*    */   double y;
/*    */   double z;
/*    */   EntityLivingBase player;
/*    */   
/*    */   public EntityElementalStaffFX(EntityLivingBase player, double d, double d1, double d2, double f1, double f2, double f3, int color) {
/* 13 */     super(player.world, player.posX + d, player.posY + d1, player.posZ + d2, f1, f2, f3);
/*    */     
/* 15 */     this.player = player;
/*    */     
/* 17 */     this.x = d;
/* 18 */     this.y = d1;
/* 19 */     this.z = d2;
/*    */     //float[] colors;
/* 21 */     float[] colors; if (color <= 15) {
/* 22 */       colors = net.minecraft.entity.passive.EntitySheep.getDyeRgb(net.minecraft.item.EnumDyeColor.byDyeDamage(color));
/*    */     } else
/* 24 */       colors = new float[] { (color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F };
/* 25 */     this.particleRed = colors[0];
/* 26 */     this.particleGreen = colors[1];
/* 27 */     this.particleBlue = colors[2];
/* 28 */     this.particleMaxAge = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void onUpdate()
/*    */   {
/* 35 */     if (this.player.isDead) {
/* 36 */       setExpired();
/* 37 */       return;
/*    */     }
/*    */     
/* 40 */     this.prevPosX = this.posX;
/* 41 */     this.prevPosY = this.posY;
/* 42 */     this.prevPosZ = this.posZ;
/* 43 */     float var1 = this.particleAge / this.particleMaxAge;
/* 44 */     float var2 = var1;
/* 45 */     var1 = -var1 + var1 * var1 * 2.0F;
/* 46 */     var1 = 1.0F - var1;
/*    */     
/* 48 */     double dx = -net.minecraft.util.math.MathHelper.sin((float)(this.player.rotationYaw / 180.0F * 3.141592653589793D)) * net.minecraft.util.math.MathHelper.cos((float)(this.player.rotationPitch / 180.0F * 3.141592653589793D));
/* 49 */     double dz = net.minecraft.util.math.MathHelper.cos((float)(this.player.rotationYaw / 180.0F * 3.141592653589793D)) * net.minecraft.util.math.MathHelper.cos((float)(this.player.rotationPitch / 180.0F * 3.141592653589793D));
/*    */     
/* 51 */     this.posX = (this.player.posX + this.x + dx + this.motionX * var1);
/* 52 */     this.posY = (this.player.posY + this.y + this.motionY * var1 + (1.0F - var2) - this.player.rotationPitch / 40.0F);
/* 53 */     this.posZ = (this.player.posZ + this.z + dz + this.motionZ * var1);
/*    */     
/* 55 */     if (this.particleAge++ >= this.particleMaxAge) {
/* 56 */       setExpired();
/*    */     }
/*    */   }
/*    */ }
