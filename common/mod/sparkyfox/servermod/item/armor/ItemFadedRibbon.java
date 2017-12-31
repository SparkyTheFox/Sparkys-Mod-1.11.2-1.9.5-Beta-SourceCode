package mod.sparkyfox.servermod.item.armor;

import java.util.List;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFadedRibbon extends ItemArmor {

	public ItemFadedRibbon(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		
		


	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (slot == EntityEquipmentSlot.HEAD || slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.FEET) {
			return ServerMod.MOD_ID + ":textures/armor/fadedribbon.png";
		} else if (slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.LEGS) {
			return null;
		} else {
			return null;
	}
		}
	
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(TextFormatting.BLUE + "If you're cuter, monsters won't hit you as hard.");
        super.addInformation(stack, playerIn, tooltip, advanced);
        }
	
													//Equip on Right Click\\
	
		  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		    {
		        ItemStack itemstack = playerIn.getHeldItem(handIn);
		        EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		        ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		        if (itemstack1.isEmpty())
		        {
		            playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
		            itemstack.setCount(0);
		            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
		        }
		        else
		        {
		            return new ActionResult(EnumActionResult.FAIL, itemstack);
		        }
		    
		    }
		  /**
		  @Override
		  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		  if (itemStack.getItem().equals(ModItems.TitaniumHelmet))
		      player.addPotionEffect(new PotionEffect(Potion.getPotionById(16)));
		  {
			  if (itemStack.getItem().equals(ModItems.TitaniumChestplate))
			      player.addPotionEffect(new PotionEffect(Potion.getPotionById(13)));
			  {
				  if (itemStack.getItem().equals(ModItems.TitaniumLeggings))
				      player.addPotionEffect(new PotionEffect(Potion.getPotionById(5)));
				  {
					  if (itemStack.getItem().equals(ModItems.TitaniumBoots))
					      player.addPotionEffect(new PotionEffect(Potion.getPotionById(12)));
				  }
					
		  }
	 }

}  
*/
				// TODO Auto-generated method stub
		  
		  
																//Anvil Repair\\


		        		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		        		return repair.getItem() == Items.LEATHER;
		        		
		        		}

		        													//Crafting Recipe\\
			        		
						}
