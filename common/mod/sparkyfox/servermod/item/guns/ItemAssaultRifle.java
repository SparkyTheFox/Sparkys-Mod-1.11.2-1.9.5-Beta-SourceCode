package mod.sparkyfox.servermod.item.guns;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityProjectile;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.init.ModWeapons;
import mod.sparkyfox.servermod.item.ItemBasic;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAssaultRifle extends ItemBasic {
	
	 @Override
	 public String getUnlocalizedName(ItemStack stack) {
	 	return "AssaultRifle" + ServerMod.RESOURCE_PREFIX + ModNames.AssaultRifle;
	 }


  public ItemAssaultRifle() {
     this.setMaxDamage(10900);
     this.setCreativeTab(CreativeTabs.COMBAT);
     this.setFull3D();
     this.setMaxStackSize(1);
     this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() 
     {

///////////////////////////////////////////	 
      @SideOnly(Side.CLIENT)
      public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         if (entityIn == null) {
           return 0.0F;
        }
         ItemStack itemstack = entityIn.getActiveItemStack();
        // return (itemstack != null) && (itemstack.getItem() == ItemSMG.this) ? (stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F : 0.0F;
         
         return entityIn == null ? -10.0F : (entityIn.getActiveItemStack().getItem() != ItemAssaultRifle.this ? -10.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F);//20.0F
      }	  
	  
     });
     
     
///////////////////////////////////////////	      
     
     addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
      @SideOnly(Side.CLIENT)
      public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         //return (entityIn != null) && (entityIn.isHandActive()) && (entityIn.getActiveItemStack() == stack) ? 1.0F : 0.0F;
         return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 0.5F : 0.0F; /**1.0= duribilty( 1 arrow = 1 point)*/
      }
    });
  }
///////////////////////////////////////////	  
  
  public void onPlayerStoppedUsing(ItemStack stack, World par2World, EntityLivingBase entity, int count)
  {
     if (!(entity instanceof EntityPlayer)) {
       return;
    }
     EntityPlayer player = (EntityPlayer)entity;
     if (player.capabilities.isCreativeMode) {
       return;
    }
     NBTTagCompound compound = stack.getTagCompound();
     if (compound == null) {
       stack.setTagCompound(compound = new NBTTagCompound());
    }
     int ticks = getMaxItemUseDuration(stack) - count;
     int shotsleft = compound.getInteger("ShotsLeft") - ticks / 6;
     if (compound.getBoolean("Reloading2")) {
       shotsleft = ticks / 5;
       if (ticks > 1)//reload, how long you can shoot for before reloading(higher the number, the less you can shoot)(i set this at 1)
         shotsleft = 120;//Higher the number, the more it will shoot before reloading(128=768(12 stacks))(150=900 bullets(14 stacks+4 bullets))
       if (shotsleft > 1) {
         compound.setInteger("ShotsLeft", shotsleft);
         compound.setBoolean("Reloading2", false);
      }
    }
     else if (shotsleft <= 0) {
       compound.setBoolean("Reloading2", true);
      stack.damageItem(900, player);//damage after reloading
    }
    else {
       compound.setInteger("ShotsLeft", shotsleft);
    }
  }
///////////////////////////////////////////	  
  public void onUsingTick(ItemStack stack, EntityLivingBase entity, int count) {
     if (entity.world.isRemote) {
       return;
    }
    
     int ticks = getMaxItemUseDuration(stack) - count;
     if (ticks % 0.5 != 0) {//0.5= fire rate lower the faster (0.5)
       return;
    }
    
     if ((entity instanceof EntityPlayer)) {
       EntityPlayer player = (EntityPlayer)entity;
       NBTTagCompound compound = stack.getTagCompound();
       if (compound == null) {
         stack.setTagCompound(compound = new NBTTagCompound());
      }
       int shotsleft = compound.getInteger("ShotsLeft") - ticks / 6;
       if (!player.capabilities.isCreativeMode) {
         if ((compound.getBoolean("Reloading2")) && (hasItem(player, ModItems.AssaultRifleRounds))) {
           if ((ticks > 0) && (ticks <= 1)) {//how long it will take to reload?
               int ticks2 = getMaxItemUseDuration(stack) - count;//set the fire duration
               if (ticks2 % 1 != 0) {//0.5= fire rate lower the faster
                 return;
               }
             playSound(player, ModSoundEvents.assaultriflereload, 1.0F, 1.0F);
          }
           return;
        }
         if ((shotsleft <= 0) || (!hasItem(player, ModItems.AssaultRifleRounds)))//if smg has no rounds left
         {  
             int ticks1 = getMaxItemUseDuration(stack) - count;//set the fire duration
             if (ticks1 % 1111.5 != 0) {//0.5= fire rate lower the faster
               return;
             }
           playSound(player, ModSoundEvents.noclip, 1.0F, 1.0F);
           return;
        }
      }
      
       if (!player.capabilities.isCreativeMode) {//if (!)? Player only is in creative mode
         consumeItem(player, ModItems.AssaultRifleRounds);//Use SMG Rounds
      }
       compound.removeTag("Reloading2");//Doesnt reload
    }
    
     EntityProjectile projectile = new EntityProjectile(entity.world, entity, new ItemStack(ModWeapons.bullet, 1, 0));
     projectile.damage = 5.0F;
     projectile.setSpeed(40);
     projectile.shoot(1.0F);
    
     playSound(entity, ModSoundEvents.assaultrifle, 0.9F, itemRand.nextFloat() * 0.3F + 0.8F);
     entity.world.spawnEntity(projectile);
  }
///////////////////////////////////////////	  

  public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
  {
     ItemStack itemstack = player.getHeldItem(hand);
     if ((!player.capabilities.isCreativeMode) && (!hasItem(player, ModItems.AssaultRifleRounds)))//if player is in creative mode and (!)Doesnt have Item(smg rounds)
       itemstack.setTagInfo("Reloading2", new net.minecraft.nbt.NBTTagByte((byte)1));
     player.setActiveHand(hand);
     return new ActionResult(net.minecraft.util.EnumActionResult.SUCCESS, itemstack);
  }
///////////////////////////////////////////	   
  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
     return 7200;
  }
///////////////////////////////////////////	   
  public EnumAction getItemUseAction(ItemStack stack)
  {
     if ((!stack.hasTagCompound()) || (!stack.getTagCompound().getBoolean("Reloading2"))) {
       return EnumAction.BOW;
    }
     return EnumAction.BLOCK;
  }
}
