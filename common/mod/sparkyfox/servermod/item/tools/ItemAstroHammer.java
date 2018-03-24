package mod.sparkyfox.servermod.item.tools;

import java.util.List;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.BlockPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;


public class ItemAstroHammer extends ItemPickaxe {
	
	private final float attackDamage;
	private final float attackSpeed;
	
	
    public ItemAstroHammer(ToolMaterial material, String unlocalizedName, float attackSpeed) {
        super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.attackSpeed = attackSpeed;
		this.attackDamage = 1.0F + material.getDamageVsEntity();
    }
    
													//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
										
    return repair.getItem() == Items.GHAST_TEAR;
	}
		
    /**@AxeAbillity*/
    
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
	   Material material = state.getMaterial();
	   return material != Material.ANVIL && material != Material.CACTUS && material != Material.CAKE && material 
			   		   != Material.CIRCUITS && material != Material.CORAL && material != Material.CRAFTED_SNOW && material 
			   		   != Material.DRAGON_EGG && material != Material.GLASS && material != Material.GOURD && material 
			   		   != Material.GRASS && material != Material.GROUND && material != Material.ICE && material 
			   		   != Material.IRON && material != Material.LEAVES && material != Material.PACKED_ICE && material 
			   		   != Material.PISTON && material != Material.REDSTONE_LIGHT && material != Material.ROCK && material 
			   		   != Material.SNOW && material  != Material.WEB && material
			   		   != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	   
	    
		
    }
	
	/**@SwordAbillity*/
	
	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier> create();

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
	        multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
	        multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", attackSpeed, 0));
	    }

	    return multimap;
	}
	
	/**@PicaxeAbillity*/
	
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        boolean ret = super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);

        if (!(entityLiving instanceof EntityPlayer))
        {
            return ret;
        }

        EntityPlayer player = (EntityPlayer) entityLiving;
        EnumFacing facing = entityLiving.getHorizontalFacing();

        if (entityLiving.rotationPitch < -45.0F)
        {
            facing = EnumFacing.UP;
        }
        else if (entityLiving.rotationPitch > 45.0F)
        {
            facing = EnumFacing.DOWN;
        }

        boolean yAxis = facing.getAxis() == EnumFacing.Axis.Y;
        boolean xAxis = facing.getAxis() == EnumFacing.Axis.X;
        
        for (int i = -1; i <= 1; ++i)
        {
            for (int j = -1; j <= 1 && !stack.isEmpty(); ++j)
            {
                if (i == 0 && j == 0)
                {
                    continue;
                }

                BlockPos pos1;
                if (yAxis)
                {
                    pos1 = pos.add(i, 0, j);
                }
                else if (xAxis)
                {
                    pos1 = pos.add(0, i, j);
                }
                else
                {
                    pos1 = pos.add(i, j, 0);
                }

                //:Replicate logic of PlayerInteractionManager.tryHarvestBlock(pos1)
                IBlockState state1 = worldIn.getBlockState(pos1);
                TileEntity tileentity = worldIn.getTileEntity(pos1);
                Block harvestedBlock = state1.getBlock(); 
                boolean canHarvest = harvestedBlock.canHarvestBlock(worldIn, pos1, player);
                boolean destroyed = harvestedBlock.removedByPlayer(state1, worldIn, pos1, player, canHarvest);
                if (destroyed)
                {
                    harvestedBlock.onBlockDestroyedByPlayer(worldIn, pos1, state1);
                }
                if (canHarvest && destroyed)
                {
                    harvestedBlock.harvestBlock(worldIn, player, pos1, state1, tileentity, stack);
                    stack.damageItem(1, player);
                }
            }
        }

        return ret;
    }
    
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(TextFormatting.BLUE + "LEEEEGEEEND!!! Of the Astro Hammer!");
        tooltip.add(TextFormatting.RED + "If found, please return to: Angus McFife, the thirteenth");
        super.addInformation(stack, playerIn, tooltip, advanced);
        }
}