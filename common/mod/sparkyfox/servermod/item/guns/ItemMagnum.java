 package mod.sparkyfox.servermod.item.guns;
 
 import javax.annotation.Nullable;

import mod.sparkyfox.servermod.entity.EntityProjectile;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.init.ModWeapons;
import mod.sparkyfox.servermod.item.ItemBasic;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
 public class ItemMagnum extends ItemBasic
 {
   public ItemMagnum()
   {
     setMaxDamage(1000);

     setFull3D();
     setMaxStackSize(1);
     
///////////////////////////////////////////     
     addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {
       @SideOnly(Side.CLIENT)
       public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         if (entityIn == null) {
           return 0.0F;
         }
         ItemStack itemstack = entityIn.getActiveItemStack();
         return (itemstack != null) && (itemstack.getItem() == ItemMagnum.this) ? (stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F : 0.0F;
       }
     });
     addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
       @SideOnly(Side.CLIENT)
       public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
         return (entityIn != null) && (entityIn.isHandActive()) && (entityIn.getActiveItemStack() == stack) ? 1.0F : 0.0F;
       }
       
     });
     addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
       @SideOnly(Side.CLIENT)
       public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
         return (entityIn != null) && (entityIn.isHandActive()) && (entityIn.getActiveItemStack() == stack) ? 1.0F : 0.0F;
       }
     });
   }
///////////////////////////////////////////
   /*rule of thumb*/
   /* ! means isnt/is not*/
   
   public void onPlayerStoppedUsing(ItemStack stack, World worldObj, EntityLivingBase entity, int count)
   {
     if (worldObj.isRemote) {
       return;
     }
     if ((entity instanceof EntityPlayer)) {
       if (!stack.hasTagCompound())
         return;
       EntityPlayer player = (EntityPlayer)entity;
       NBTTagCompound compound = stack.getTagCompound();
       if ((!compound.getBoolean("IsLoaded2")) && (!player.capabilities.isCreativeMode)) {//Translation: if the compound is not "IsLoaded2" and the player is not in creative mode 
         playSound(player, ModSoundEvents.noclip, 1.0F, 1.0F);//Translation: Play the sound no clip
         return;
       }
       
       if ((compound.getBoolean("Reloading2")) && (!player.capabilities.isCreativeMode)) {//Translation: if the compound is "ReLoading2" and the player is not in creative mode 
         compound.setBoolean("Reloading2", false);//Translation: the compound "Reloading2" will not reload if its loaded(or will not reload again)
         return;//Translation: return nothing
       }
       
       if ((compound.getBoolean("Reloading2")) && (!player.capabilities.isCreativeMode)) {//Translation: if the compound is "ReLoading2" and the player is not in creative mode 
           compound.setBoolean("Reloading2", false);//Translation: the compound "Reloading2" will not reload if its loaded(or will not reload again)
           return;//Translation: return nothing
         }
       
       if (!player.capabilities.isCreativeMode)//Translation: if the player is not in creative mode 
         consumeItem(player, ModItems.MagnumRounds);//Translation: then the magnum WILL use Ammo
       compound.setBoolean("IsLoaded2", false);//Translation: then the magnum will not be loaded after its used ammo
     }
     
     stack.damageItem(1, entity);//Translation: Every shot fire will cause 1 damage point to the magnum
     EntityProjectile projectile = new EntityProjectile(worldObj, entity, new ItemStack(ModWeapons.bullet, 1, 0));//Translation: use this as a projectile 
     projectile.damage = 10.0F;//Translation: set the damage the porjectile will do)
     projectile.setSpeed(40);//Translation: set the velocity of the profectile(value of speed)
     projectile.shoot(0.001F);//Translation: will shoot the projectile(the float is the seeed accuracy-lower the better)
     worldObj.spawnEntity(projectile);//Translation: Spawn the set projectile which is this -----^^^(ModWeapons.bullet)
     
     playSound(entity, ModSoundEvents.magnum, 1.0F, 1.0F);

   }
   
 ///////////////////////////////////////////
 
   public void onUsingTick(ItemStack stack, EntityLivingBase entity, int count)
   {
     if ((entity.world.isRemote) || (!(entity instanceof EntityPlayer))) {
       return;
     }
     EntityPlayer player = (EntityPlayer)entity;
     
     int ticks = getMaxItemUseDuration(stack) - count;
     
     if ((!player.capabilities.isCreativeMode) && (stack.hasTagCompound()) && 
       (stack.getTagCompound().getBoolean("Reloading2")) && (hasItem(player, ModItems.MagnumRounds)) && 
       (ticks == 2)) {//how long it takes to reload
       playSound(player, ModSoundEvents.magnumreload, 1.0F, 1.0F);
       stack.setTagInfo("IsLoaded2", new NBTTagByte((byte)1));
     }
   }
   
 ///////////////////////////////////////////
 
   public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
   {
     ItemStack itemstack = player.getHeldItem(hand);
     NBTTagCompound compound = itemstack.getTagCompound();
     if (compound == null)
       itemstack.setTagCompound(compound = new NBTTagCompound());
     if ((!player.capabilities.isCreativeMode) && (hasItem(player, ModItems.MagnumRounds)) && (!compound.getBoolean("IsLoaded2")))
       itemstack.setTagInfo("Reloading2", new NBTTagByte((byte)1));
     player.setActiveHand(hand);
     return new ActionResult(net.minecraft.util.EnumActionResult.SUCCESS, itemstack);
   }
   
   public int getMaxItemUseDuration(ItemStack par1ItemStack)
   {
     return 72000;
   }
   
   public EnumAction getItemUseAction(ItemStack stack)
   {
     if ((!stack.hasTagCompound()) || (!stack.getTagCompound().getBoolean("Reloading2"))) {
       return EnumAction.NONE;
     }
     return EnumAction.BLOCK;
   }
 }
