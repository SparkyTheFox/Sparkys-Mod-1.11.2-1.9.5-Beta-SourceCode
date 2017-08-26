package mod.sparkyfox.servermod.item.guns;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemAK4URounds extends ItemArrow {
	
	


	@Override
	public String getUnlocalizedName(ItemStack stack) {

	return "AK4URounds" + ServerMod.RESOURCE_PREFIX + ModNames.AK4URounds; 
		
	}
		
		 public ItemAK4URounds()
		    {
		        this.setCreativeTab(CreativeTabs.COMBAT);
		    }

		    public EntityArrow createArrow(@Nonnull World world, @Nonnull ItemStack itemstack, EntityLivingBase shooter) {
		        return new EntityAK4URounds(world, shooter);
			}
			

		    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
		    {
		        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
		        return enchant <= 0 ? false : this.getClass() == ItemAK4URounds.class;
		    }
		


																			//Crafting Recipe\\


		    		public void addRecipes() {
		    		GameRegistry.addShapedRecipe(new ItemStack(this), "III", "III", "DDD", 'D', Items.GUNPOWDER, 'I',
		    		new ItemStack(Items.field_191525_da));
		    		}

		}
