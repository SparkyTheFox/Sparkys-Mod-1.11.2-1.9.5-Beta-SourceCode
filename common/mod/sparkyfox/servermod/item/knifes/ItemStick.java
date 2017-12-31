package mod.sparkyfox.servermod.item.knifes;

import java.util.List;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemStick extends ItemSword {

	
	private final float attackDamage;
	private final float attackSpeed;
	
	
    public ItemStick(ToolMaterial material, float attackSpeed) {
        super(material);;
		this.attackSpeed = attackSpeed;
		this.attackDamage = 0.0F + material.getDamageVsEntity();
		
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "Stick" + ServerMod.RESOURCE_PREFIX + ModNames.Stick;
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

	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(TextFormatting.BLUE + "Its bark is worse than its bite.");
        super.addInformation(stack, playerIn, tooltip, advanced);
        }

												
													//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
										
    return repair.getItem() == Items.STICK;
	}

													//Crafting Recipe\\


	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Stick, 1), Items.STICK); 
	}
		
	}
  
