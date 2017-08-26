package mod.sparkyfox.servermod.block;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockButton;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRedButton extends BlockButton {
	
	@Override
	public String getUnlocalizedName() {
		return "RedButton" + ServerMod.RESOURCE_PREFIX + ModNames.RedButton;  // CobaltOre.ServerMod:CobaltOre
	}
	
	public BlockRedButton() {							  	      //===================================================================================================================//
		super(false);							  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(2.5f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(5.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.REDSTONE);		    //===================================================================================================================// 
        
      
     }
            

    protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos)
    {
        worldIn.playSound(player, pos, ModSoundEvents.alarm, SoundCategory.BLOCKS, 1000.0F, 1.0F);
    }

    protected void playReleaseSound(World worldIn, BlockPos pos)
    {
       // worldIn.playSound((EntityPlayer)null, pos, ModSoundEvents.mus_battle1, SoundCategory.BLOCKS, 0.3F[VOLUME], 0.5F[PITCH]);
    }
    
	
																		//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this), Blocks.REDSTONE_BLOCK, 
				new ItemStack(Blocks.NOTEBLOCK), new ItemStack(ModItems.CraftingHammer));
}
}