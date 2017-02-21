package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSMGRounds extends ItemArrow {
	

	@Override
	public String getUnlocalizedName(ItemStack stack) {

	return "SMGRounds" + ServerMod.RESOURCE_PREFIX + ModNames.SMGRounds; 
		
	}
		
		 public ItemSMGRounds(float f)
		    {
		        this.setCreativeTab(CreativeTabs.COMBAT);
		    }

		    public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
				return null;
			}
			

		    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
		    {
		        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
		        return enchant <= 0 ? false : this.getClass() == ItemSMGRounds.class;
		    }
		


																			//Crafting Recipe\\


		    		public void addRecipes() {
		    		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", "III", "DDD", 'D', Items.GUNPOWDER, 'I',
		    		new ItemStack(Items.IRON_INGOT));
		    		}

		}
