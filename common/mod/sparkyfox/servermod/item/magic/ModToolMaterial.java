 package mod.sparkyfox.servermod.item.magic;
 
 public enum ModToolMaterial
 {
   WOOD(0, 59, 2.0F, 0, 15), 
   STONE(1, 131, 4.0F, 1, 5), 
   BRONZE(2, 170, 5.0F, 2, 15), 
   IRON(2, 250, 6.0F, 2, 14), 
   DIA(3, 1561, 8.0F, 3, 10), 
   GOLD(0, 32, 12.0F, 1, 22), 
   EMERALD(3, 1000, 8.0F, 4, 10), 
   DEMONIC(3, 100, 8.0F, 6, 10), 
   FROST(2, 59, 6.0F, 3, 5), 
   TITANIUM(2, 59, 6.0F, 3, 5),
   MITHRIL(3, 3000, 8.0F, 3, 10);
	 
 
 
 
   private final int harvestLevel;
   
 
 
   private final int maxUses;
   
 
 
   private final float efficiencyOnProperMaterial;
   
 
   private final int damageVsEntity;
   
 
   private final int enchantability;
   
 
 
   private ModToolMaterial(int par3, int par4, float par5, int par6, int par7)
   {
/* 39 */     this.harvestLevel = par3;
/* 40 */     this.maxUses = par4;
/* 41 */     this.efficiencyOnProperMaterial = par5;
/* 42 */     this.damageVsEntity = par6;
/* 43 */     this.enchantability = par7;
   }
   
 
 
 
   public int getMaxUses()
   {
/* 51 */     return this.maxUses;
   }
   
 
 
 
   public float getEfficiencyOnProperMaterial()
   {
/* 59 */     return this.efficiencyOnProperMaterial;
   }
   
 
 
 
   public int getDamageVsEntity()
   {
/* 67 */     return this.damageVsEntity;
   }
   
 
 
 
   public int getHarvestLevel()
   {
/* 75 */     return this.harvestLevel;
   }
   
 
 
 
   public int getEnchantability()
   {
/* 83 */     return this.enchantability;
   }
 }
