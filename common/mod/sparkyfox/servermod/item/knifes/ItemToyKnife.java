package mod.sparkyfox.servermod.item.knifes;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemToyKnife extends ItemSword {

	
	private final float attackDamage;
	private final float attackSpeed;
	
	
    public ItemToyKnife(ToolMaterial material, float attackSpeed) {
        super(material);
		this.attackSpeed = attackSpeed;
		this.attackDamage = 1.0F + material.getDamageVsEntity();
		
		

    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "ToyKnife" + ServerMod.RESOURCE_PREFIX + ModNames.ToyKnife;
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


																							//Shear ability//

/**
 * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
 */
public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
{
    if (!worldIn.isRemote)
    {
        stack.damageItem(1, entityLiving);
    }

    Block block = state.getBlock();
    return state.getMaterial() != Material.LEAVES && block != Blocks.WEB && block != Blocks.TALLGRASS && block != Blocks.VINE && block != Blocks.TRIPWIRE && block != Blocks.WOOL && !(state instanceof net.minecraftforge.common.IShearable) ? super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving) : true;
}

/**
 * Check whether this Item can harvest the given Block
 */
public boolean canHarvestBlock(IBlockState blockIn)
{
    Block block = blockIn.getBlock();
    return block == Blocks.WEB || block == Blocks.REDSTONE_WIRE || block == Blocks.TRIPWIRE;
}

public float getStrVsBlock(ItemStack stack, IBlockState state)
{
    Block block = state.getBlock();
    return block != Blocks.WEB && state.getMaterial() != Material.LEAVES ? (block == Blocks.WOOL ? 5.0F : super.getStrVsBlock(stack, state)) : 15.0F;
}


/**
 * Returns true if the item can be used on the given entity, e.g. shears on sheep.
 */
@Override
public boolean itemInteractionForEntity(ItemStack itemstack, net.minecraft.entity.player.EntityPlayer player, EntityLivingBase entity, net.minecraft.util.EnumHand hand)
{
    if (entity.world.isRemote)
    {
        return false;
    }
    if (entity instanceof net.minecraftforge.common.IShearable)
    {
        net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)entity;
        BlockPos pos = new BlockPos(entity.posX, entity.posY, entity.posZ);
        if (target.isShearable(itemstack, entity.world, pos))
        {
            java.util.List<ItemStack> drops = target.onSheared(itemstack, entity.world, pos,
                    net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, itemstack));

            java.util.Random rand = new java.util.Random();
            for(ItemStack stack : drops)
            {
                net.minecraft.entity.item.EntityItem ent = entity.entityDropItem(stack, 1.0F);
                ent.motionY += rand.nextFloat() * 0.05F;
                ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
                ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
            }
            itemstack.damageItem(0, entity);
        }
        return true;
    }
    return false;
}

@Override
public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, net.minecraft.entity.player.EntityPlayer player)
{
    if (player.world.isRemote || player.capabilities.isCreativeMode)
    {
        return false;
    }
    Block block = player.world.getBlockState(pos).getBlock();
    if (block instanceof net.minecraftforge.common.IShearable)
    {
        net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)block;
        if (target.isShearable(itemstack, player.world, pos))
        {
            java.util.List<ItemStack> drops = target.onSheared(itemstack, player.world, pos,
                    net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, itemstack));
            java.util.Random rand = new java.util.Random();

            for(ItemStack stack : drops)
            {
                float f = 0.7F;
                double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                net.minecraft.entity.item.EntityItem entityitem = new net.minecraft.entity.item.EntityItem(player.world, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
                entityitem.setDefaultPickupDelay();
                player.world.spawnEntity(entityitem);
            }

            itemstack.damageItem(0, player);
            player.addStat(net.minecraft.stats.StatList.getBlockStats(block));
        }
    }
    return false;
}

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == Items.IRON_INGOT;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), " I ", "S  ", 'I', Items.IRON_SWORD, 'S',
				new ItemStack(Items.SHEARS));
	}
		
	}
    
