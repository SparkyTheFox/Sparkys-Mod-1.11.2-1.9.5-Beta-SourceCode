 package mod.sparkyfox.servermod.item;
 
 import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.SPacketCustomSound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

 
 public class ItemHidden extends Item
 {
   private boolean damageAble = true;
   
   public ItemHidden() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(50);
	    this.setCreativeTab(null);
	  }

	  @Override
	  public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
	    // no creative items, nono
		
   }
   
   public void setUnDamageable() {
     this.damageAble = false;
   }
   
   public Item register(String name) {
     setUnlocalizedName(name);
     ServerMod.proxy.registerItem(this, name, 0);
     
     return this;
   }
   
   public static void playSound(EntityLivingBase entity, SoundEvent sound, float volume, float pitch) {
     if (entity.world.isRemote) {
       entity.world.playSound(null, entity.posX, entity.posY, entity.posZ, sound, SoundCategory.NEUTRAL, volume, pitch);
     } else {
       SPacketCustomSound packet = new SPacketCustomSound(sound.getRegistryName().toString(), SoundCategory.NEUTRAL, entity.posX, entity.posY, entity.posZ, volume, pitch);
       entity.getServer().getPlayerList().sendToAllNearExcept(null, entity.posX, entity.posY, entity.posZ, volume > 1.0F ? 16.0F * volume : 16.0D, entity.world.provider.getDimension(), packet);
     }
   }
   
   
 
   public int getItemEnchantability()
   {
     return super.getItemEnchantability();
   }
   
   public Item setUnlocalizedName(String name)
   {
     super.setUnlocalizedName(name);
     return this;
   }
   
   public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
   {
     if (par2EntityLiving.getHealth() <= 0.0F)
       return false;
     if (this.damageAble)
       par1ItemStack.damageItem(1, par3EntityLiving);
     return true;
   }
   
   public boolean hasItem(EntityPlayer player, Item item) {
     return getItemStack(player, item) != null;
   }
   
   public boolean consumeItem(EntityPlayer player, Item item) {
     ItemStack itemstack = getItemStack(player, item);
     if (itemstack == null) {
       return false;
     }
     itemstack.shrink(1);
     
     if (itemstack.getCount() == 0) {
       player.inventory.deleteStack(itemstack);
     }
     return true;
   }
   
   private ItemStack getItemStack(EntityPlayer player, Item item)
   {
     if ((player.getHeldItem(EnumHand.OFF_HAND) != null) && (player.getHeldItem(EnumHand.OFF_HAND).getItem() == item)) {
       return player.getHeldItem(EnumHand.OFF_HAND);
     }
     if ((player.getHeldItem(EnumHand.MAIN_HAND) != null) && (player.getHeldItem(EnumHand.MAIN_HAND).getItem() == item)) {
       return player.getHeldItem(EnumHand.MAIN_HAND);
     }
     for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
       ItemStack itemstack = player.inventory.getStackInSlot(i);
       
       if ((itemstack != null) && (itemstack.getItem() == item)) {
         return itemstack;
       }
     }
     
     return null;
   }
 }
