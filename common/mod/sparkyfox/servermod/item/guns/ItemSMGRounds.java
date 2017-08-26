package mod.sparkyfox.servermod.item.guns;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSMGRounds extends ItemArrow {
	
	


	@Override
	public String getUnlocalizedName(ItemStack stack) {

	return "SMGRounds" + ServerMod.RESOURCE_PREFIX + ModNames.SMGRounds; 
		
	}
		
		 public ItemSMGRounds()
		    {
		        this.setCreativeTab(CreativeTabs.COMBAT);
		    }

		    public EntitySMGRounds createArrow(@Nonnull World world, @Nonnull ItemStack itemstack, EntityLivingBase shooter) {
		        return new EntitySMGRounds(world, shooter);
			}
			

		    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
		    {
		        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
		        return enchant <= 0 ? false : this.getClass() == ItemSMGRounds.class;
		    }
		


																			//Crafting Recipe\\


		    		public void addRecipes() {
		    		GameRegistry.addShapedRecipe(new ItemStack(this, 9), "SSS", "SSS", "SSS", 'S', ModItems.SMGBullet);
		    		}

		}
