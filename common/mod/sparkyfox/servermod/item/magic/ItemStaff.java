 package mod.sparkyfox.servermod.item.magic;
 
 import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityProjectile;
import mod.sparkyfox.servermod.init.ModEnchant;
import mod.sparkyfox.servermod.init.ModFunItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.init.ModWeapons;
import mod.sparkyfox.servermod.item.ItemBasic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
 public class ItemStaff extends ItemBasic {
   private ModToolMaterial material;
   
   public ItemStaff(ModToolMaterial material)
   {
     this.material = material;
     setFull3D();
     setMaxStackSize(1);
     
     addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {
       @SideOnly(Side.CLIENT)
       public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         if (entityIn == null) {
           return 0.0F;
         }
         ItemStack itemstack = entityIn.getActiveItemStack();
         return (itemstack != null) && (itemstack.getItem() == ItemStaff.this) ? (stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F : 0.0F;
       }
     });
     addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
       @SideOnly(Side.CLIENT)
       public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         return (entityIn != null) && (entityIn.isHandActive()) && (entityIn.getActiveItemStack() == stack) ? 1.0F : 0.0F;
       }
     });
   }
   
   public void onPlayerStoppedUsing(final ItemStack stack, World worldObj, EntityLivingBase entity, int par4)
   {
     if (worldObj.isRemote) {
       return;
     }
     if (stack.getTagCompound() == null)
       return;
     Entity proj = ((WorldServer)worldObj).getEntityByID(stack.getTagCompound().getInteger("MagicProjectile"));
     if ((proj == null) || (!(proj instanceof EntityProjectile)))
       return;
     EntityProjectile item = (EntityProjectile)proj;
     item.callback = new mod.sparkyfox.servermod.entity.EntityProjectile.IProjectileCallback()

     {
       public boolean onImpact(EntityProjectile entityProjectile, BlockPos pos, Entity entity)
       {
         if ((entity == null) || (!(entity instanceof EntityLivingBase)))
           return false;
         EntityLivingBase living = (EntityLivingBase)entity;
         int confusion = ModEnchant.getLevel(ModEnchant.Confusion, stack);
         if ((confusion > 0) && 
           (living.getRNG().nextInt(4) > confusion)) {
           living.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100));
         }
         int poison = ModEnchant.getLevel(ModEnchant.Poison, stack);
         if ((poison > 0) && 
           (living.getRNG().nextInt(4) > poison)) {
           living.addPotionEffect(new PotionEffect(MobEffects.POISON, 100));
         }
         return false;
       }
     };
     item.explosiveDamage = false;
     item.explosiveRadius = 1;
     item.prevRotationYaw = (item.rotationYaw = entity.rotationYaw);
     item.prevRotationPitch = (item.rotationPitch = entity.rotationPitch);
     item.shoot(2.0F);
     
     playSound(entity, ModSoundEvents.shot, 1.0F, 1.0F);
   }
   
 
   public void onUsingTick(ItemStack stack, EntityLivingBase entity, int count)
   {
     int tick = getMaxItemUseDuration(stack) - count;
     if (entity.world.isRemote) {
       spawnParticle(stack, entity);
       return;
     }
     int chargeTime = 20 + this.material.getHarvestLevel() * 8;
     if (tick == chargeTime) {
       if ((entity instanceof EntityPlayer)) {
         EntityPlayer player = (EntityPlayer)entity;
         if ((!player.capabilities.isCreativeMode) && (!hasInfinite(stack))) {
           if (!hasItem(player, ModWeapons.mana))
             return;
           consumeItem(player, ModWeapons.mana);
         }
       }
       playSound(entity, ModSoundEvents.charge, 1.0F, 1.0F);
       
       int damage = 6 + this.material.getDamageVsEntity() + entity.world.rand.nextInt(4);
       damage = (int)(damage + damage * ModEnchant.getLevel(ModEnchant.Damage, stack) * 0.5F);
       EntityProjectile projectile = new mod.sparkyfox.servermod.entity.EntityProjectile(entity.world, entity, getProjectile(stack));
       projectile.damage = damage;
       projectile.setSpeed(25);
       double dx = -MathHelper.sin((float)(entity.rotationYaw / 180.0F * 3.141592653589793D)) * MathHelper.cos((float)(entity.rotationPitch / 180.0F * 3.141592653589793D));
       double dz = MathHelper.cos((float)(entity.rotationYaw / 180.0F * 3.141592653589793D)) * MathHelper.cos((float)(entity.rotationPitch / 180.0F * 3.141592653589793D));
       projectile.setPosition(entity.posX + dx * 0.8D, entity.posY + 1.5D - entity.rotationPitch / 80.0F, entity.posZ + dz * 0.8D);
       entity.world.spawnEntity(projectile);
       stack.setTagInfo("MagicProjectile", new net.minecraft.nbt.NBTTagInt(projectile.getEntityId()));
     }
     if ((tick > chargeTime) && (stack.getTagCompound() != null)) {
       Entity proj = ((WorldServer)entity.world).getEntityByID(stack.getTagCompound().getInteger("MagicProjectile"));
       if ((proj == null) || (!(proj instanceof EntityProjectile)))
         return;
       EntityProjectile item = (EntityProjectile)proj;
       item.ticksInAir = 0;
       
       double dx = -MathHelper.sin((float)(entity.rotationYaw / 180.0F * 3.141592653589793D)) * MathHelper.cos((float)(entity.rotationPitch / 180.0F * 3.141592653589793D));
       double dz = MathHelper.cos((float)(entity.rotationYaw / 180.0F * 3.141592653589793D)) * MathHelper.cos((float)(entity.rotationPitch / 180.0F * 3.141592653589793D));
       item.setPosition(entity.posX + dx * 0.8D, entity.posY + 1.5D - entity.rotationPitch / 80.0F, entity.posZ + dz * 0.8D);
     }
   }
   
   public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
   {
     ItemStack itemstack = player.getHeldItem(hand);
     player.setActiveHand(hand);
     return new ActionResult(net.minecraft.util.EnumActionResult.SUCCESS, itemstack);
   }
   
   public int getMaxItemUseDuration(ItemStack par1ItemStack) {
     return 72000;
   }
   
   public EnumAction getItemUseAction(ItemStack par1ItemStack)
   {
     return EnumAction.BOW;
   }
   
   public ItemStack getProjectile(ItemStack stack) {
     if (stack.getItem() == ModWeapons.wooden_staff) {
       return new ItemStack(ModFunItems.spell_nature);
     }
     if ((stack.getItem() == ModWeapons.stone_staff) || (stack.getItem() == ModWeapons.demonic_staff)) {
       return new ItemStack(ModFunItems.spell_dark);
     }
     if ((stack.getItem() == ModWeapons.iron_staff) || (stack.getItem() == ModWeapons.mithril_staff)) {
       return new ItemStack(ModFunItems.spell_holy);
     }
     if (stack.getItem() == ModWeapons.bronze_staff) {
       return new ItemStack(ModFunItems.spell_lightning);
     }
     if (stack.getItem() == ModWeapons.golden_staff) {
       return new ItemStack(ModFunItems.spell_fire);
     }
     if ((stack.getItem() == ModWeapons.diamond_staff) || (stack.getItem() == ModWeapons.frost_staff)) {
       return new ItemStack(ModFunItems.spell_ice);
     }
     if (stack.getItem() == ModWeapons.emerald_staff) {
       return new ItemStack(ModFunItems.spell_arcane);
     }
     return new ItemStack(ModFunItems.orb, 1, stack.getItemDamage());
   }
   
   public void spawnParticle(ItemStack stack, EntityLivingBase entity)
   {
     if (stack.getItem() == ModWeapons.wooden_staff) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(12), Integer.valueOf(2) });
     }
     else if ((stack.getItem() == ModWeapons.stone_staff) || (stack.getItem() == ModWeapons.demonic_staff)) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(5649239), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(4400964), Integer.valueOf(2) });
     }
     else if (stack.getItem() == ModWeapons.bronze_staff) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(8648694), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(6091007), Integer.valueOf(2) });
     }
     else if ((stack.getItem() == ModWeapons.iron_staff) || (stack.getItem() == ModWeapons.mithril_staff)) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(16580553), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(15728535), Integer.valueOf(2) });
     }
     else if (stack.getItem() == ModWeapons.golden_staff) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(14), Integer.valueOf(2) });
     }
     else if ((stack.getItem() == ModWeapons.diamond_staff) || (stack.getItem() == ModWeapons.frost_staff)) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(9756653), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(4503295), Integer.valueOf(2) });
     }
     else if (stack.getItem() == ModWeapons.emerald_staff) {
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(16761831), Integer.valueOf(2) });
       ServerMod.proxy.spawnParticle(entity, "Spell", new Object[] { Integer.valueOf(16487167), Integer.valueOf(2) });
     }
   }
   
   public int getItemEnchantability()
   {
     return this.material.getEnchantability();
   }
   
 
 
 
   public boolean hasInfinite(ItemStack stack)
   {
     return ModEnchant.getLevel(ModEnchant.Infinite, stack) > 0;
   }
 }
