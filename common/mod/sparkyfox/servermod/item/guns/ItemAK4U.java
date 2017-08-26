package mod.sparkyfox.servermod.item.guns;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAK4U extends ItemBow
{

@Override
public String getUnlocalizedName(ItemStack stack) {

	return "AK4U" + ServerMod.RESOURCE_PREFIX + ModNames.AK4U;

}
    public ItemAK4U()
    {
	this.maxStackSize = 1;
    this.setMaxDamage(1000);//384 //768
    this.setCreativeTab(CreativeTabs.COMBAT);
    this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
    {
    	 @SideOnly(Side.CLIENT)
         public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
         {
             return entityIn == null ? -10.0F : (entityIn.getActiveItemStack().getItem() != ModItems.AK4U ? -10.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F);//20.0F
         }//
     });
    this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
    {
        @SideOnly(Side.CLIENT)
        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
        {
            return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 0.5F : 0.0F; //1.0= duribilty( 1 arrow = 1 point)
        }
    });
}

private ItemStack findAmmo(EntityPlayer player)
{
    if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND)))
    {
        return player.getHeldItem(EnumHand.OFF_HAND);
    }
    else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND)))
    {
        return player.getHeldItem(EnumHand.MAIN_HAND);
    }
    else
    {
        for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
        {
            ItemStack itemstack = player.inventory.getStackInSlot(i);

            if (this.isArrow(itemstack))
            {
                return itemstack;
            }
        }

        return ItemStack.EMPTY;
    }
}

protected boolean isArrow(ItemStack stack)
{
    return stack.getItem() instanceof ItemAK4URounds;
}

/**
 * Called when the player stops using an Item (stops holding the right mouse button).
 */
public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
{
    if (entityLiving instanceof EntityPlayer)
    {
        EntityPlayer entityplayer = (EntityPlayer)entityLiving;
        boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
        ItemStack itemstack = this.findAmmo(entityplayer);

        int i = this.getMaxItemUseDuration(stack) - timeLeft;
        i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, entityplayer, i, !itemstack.isEmpty() || flag);
        if (i < 0) return;

        if (!itemstack.isEmpty() || flag)
        {
            if (itemstack.isEmpty())
            {
                itemstack = new ItemStack(ModItems.AK4URounds);
            }

            float f = getArrowVelocity(i);

            if ((double)f >= -10000.0D)//bow charge
            {
                boolean flag1 = entityplayer.capabilities.isCreativeMode || (itemstack.getItem() instanceof ItemAK4URounds && ((ItemAK4URounds) itemstack.getItem()).isInfinite(itemstack, stack, entityplayer));

                if (!worldIn.isRemote)
                {
                    ItemAK4URounds itemarrow = (ItemAK4URounds)((ItemAK4URounds)(itemstack.getItem() instanceof ItemAK4URounds ? itemstack.getItem() : ModItems.AK4URounds));
                    EntityArrow entityarrow = itemarrow.createArrow(worldIn, itemstack, entityplayer);
                    entityarrow.setAim(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);

                    if (f == 1.0F)
                    {
                        entityarrow.setIsCritical(true);
                        entityarrow.setDamage(4.0F);
                    }

                    int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);

                    if (j > 100)
                    {
                        entityarrow.setDamage(entityarrow.getDamage() + (double)j * 100.5D + 100.5D);
                    }

                    int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);

                    if (k > 100)
                    {
                        entityarrow.setKnockbackStrength(k);
                    }

                    if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 100)
                    {
                        entityarrow.setFire(100);
                    }

                    stack.damageItem(1, entityplayer);

                    if (flag1 || entityplayer.capabilities.isCreativeMode && (itemstack.getItem() == Items.SPECTRAL_ARROW || itemstack.getItem() == Items.TIPPED_ARROW))
                    {
                        entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
                    }

                    worldIn.spawnEntity(entityarrow);
                }

                worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, ModSoundEvents.ak4u, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (!flag1 && !entityplayer.capabilities.isCreativeMode)
                {
                    itemstack.shrink(1);

                    if (itemstack.isEmpty())
                    {
                        entityplayer.inventory.deleteStack(itemstack);
                    }
                }

                entityplayer.addStat(StatList.getObjectUseStats(this));
            }
        }
    }
}

/**
 * Gets the velocity of the arrow entity from the bow's charge
 */
public static float getArrowVelocity(int charge)
{
    float f = (float)charge / 0.0000001F;//Arrow Fire distance
    f = (f * f + f * 2.0F) / 3.0F;

    if (f > 1.0F)
    {
        f = 1.0F;
    }

    return f;
}

/**
 * How long it takes to use or consume an item
 */
public int getMaxItemUseDuration(ItemStack stack)
{
    return 102000;//72000
}

/**
 * returns the action that specifies what animation to play when the items is being used
 */
public EnumAction getItemUseAction(ItemStack stack)
{
    return EnumAction.BOW;
}

public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
{
    ItemStack itemstack = playerIn.getHeldItem(handIn);
    boolean flag = !this.findAmmo(playerIn).isEmpty();

    ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
    if (ret != null) return ret;

    if (!playerIn.capabilities.isCreativeMode && !flag)
    {
        return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
    }
    else
    {
        playerIn.setActiveHand(handIn);
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
}

/**
 * Return the enchantability factor of the item, most of the time is based on material.
 */
public int getItemEnchantability()
{
    return 1;
}

																		//Anvil Repair\\


							public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
							return repair.getItem() == Items.IRON_INGOT;
							}

																		//Crafting Recipe\\


							public void addRecipes() {
							GameRegistry.addShapedRecipe(new ItemStack(this), " G ", "WIB", "WT ", 'G', Items.GOLD_INGOT, 'W',
							new ItemStack (Blocks.PLANKS), 'I', new ItemStack (Blocks.IRON_BLOCK), 'B', new ItemStack (Items.IRON_INGOT), 'T', new ItemStack (Blocks.WOODEN_BUTTON));	
}

}


