package mod.sparkyfox.servermod.block;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockButton;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRedButton2 extends BlockButton {
	
	@Override
	public String getUnlocalizedName() {
		return "RedButton2" + ServerMod.RESOURCE_PREFIX + ModNames.RedButton2;  // CobaltOre.ServerMod:CobaltOre
	}
	
	public BlockRedButton2() {							  	      //===================================================================================================================//
		super(false);							  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(2.5f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(5.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.REDSTONE);		    //===================================================================================================================// 
        
      
     }
            

    protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos)
    {
        worldIn.playSound(player, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
    }

    protected void playReleaseSound(World worldIn, BlockPos pos)
    {
        worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
    }
    
	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this), Blocks.REDSTONE_BLOCK, 
				new ItemStack(ModItems.CraftingHammer));
	}
}