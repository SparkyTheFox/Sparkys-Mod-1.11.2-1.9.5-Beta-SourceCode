package mod.sparkyfox.servermod.item.swords;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemLapisSword extends ItemSword {

	
	private final float attackDamage;
	private final float attackSpeed;
	
	
    public ItemLapisSword(ToolMaterial material, float attackSpeed) {
        super(material);;
		this.attackSpeed = attackSpeed;
		this.attackDamage = 0.0F + material.getDamageVsEntity();
		
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "LapisSword" + ServerMod.RESOURCE_PREFIX + ModNames.LapisSword;
	}


	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier> create();

	if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
        multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
        multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", attackSpeed, 0));
    }

    return multimap;
}

												
																						//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
										
    return repair.getItem() == ModItems.TitaniumHammer;
	}

																						//Crafting Recipe\\


	public void addRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(this), " L ", " L ", " S ", 'L', "dyeBlue", 'S',
				new ItemStack(Items.STICK)));
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
