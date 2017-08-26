package mod.sparkyfox.servermod.item.armor;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemLapisArmorHeavy extends ItemArmor {

	public ItemLapisArmorHeavy(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		
		

	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (slot == EntityEquipmentSlot.HEAD || slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.FEET) {
			return ServerMod.MOD_ID + ":textures/armor/fulllapis_1.png";
		} else if (slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.LEGS) {
			return ServerMod.MOD_ID + ":textures/armor/fulllapis_2.png";
		} else {
			return null;
	}
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
		  if (itemStack.getItem().equals(ModItems.EmeraldHelmet))
		      player.addPotionEffect(new PotionEffect(Potion.getPotionById(16)));
		  {
			  if (itemStack.getItem().equals(ModItems.EmeraldChestplate))
			      player.addPotionEffect(new PotionEffect(Potion.getPotionById(13)));
			  {
				  if (itemStack.getItem().equals(ModItems.EmeraldLeggings))
				      player.addPotionEffect(new PotionEffect(Potion.getPotionById(5)));
				  {
					  if (itemStack.getItem().equals(ModItems.EmeraldBoots))
					      player.addPotionEffect(new PotionEffect(Potion.getPotionById(12)));
				  }
					
		  }
	 }

}  
*/
				// TODO Auto-generated method stub
		  
		  
																//Anvil Repair\\


		        		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		        		return repair.getItem() == ModItems.TitaniumHammer;
		        		
		        		}

		        													//Crafting Recipe\\


		        		public void addRecipes() {
		        			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.LapisHelmetHeavy), "LLL", "LTL", "LLL", 'L', "dyeBlue", 'T',
			        				new ItemStack(ModItems.TitaniumHammer)));	
		        		{
		        			
		        		}
		        			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.LapisChestplateHeavy), "LTL", "LLL", "LLL", 'L',"dyeBlue", 'T',
			        				new ItemStack(ModItems.TitaniumHammer)));	
			        	{
			        			
			        	}
			        		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.LapisLeggingsHeavy), "LLL", "LTL", "L L", 'L', "dyeBlue", 'T',
			        				new ItemStack(ModItems.TitaniumHammer)));	
		
			        	{
			        			
			        	}
		        	
			        		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.LapisBootsHeavy), "T T", "L L", "L L", 'L', "dyeBlue", 'T',
			        				new ItemStack(ModItems.TitaniumHammer)));
		
			        		}
			        		
						}




/**
 	ore dictionary Recipe
 	=================================================================================================================================
 	|	public void addRecipes() {																									|
	|	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.LapisHelmet), "LLL", "L L", "LLL", 'L', "dyeBlue");    	|
	|	{ 																															|
	|																																|
	|	} 																															|
 	=================================================================================================================================
 	
 	
 	dye dictionary Recipe
 	=================================================================================================================================
 	|	public void addRecipes() {																									|
 	|	ItemStack blueDye = new ItemStack(Items.DYE, 1, 4);																			|
 	|	GameRegistry.addShapedRecipe(new ItemStack(ModItems.LapisHelmet), "LLL", "L L", "LLL", 'L', blueDye); 						|
 	|	{																															|
 	|																																|
 	|	}																															|
 	=================================================================================================================================
 	
 	

                            
 	
 */

