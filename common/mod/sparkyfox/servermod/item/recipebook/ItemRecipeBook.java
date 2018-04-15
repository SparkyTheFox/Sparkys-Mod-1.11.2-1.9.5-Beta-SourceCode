 package mod.sparkyfox.servermod.item.recipebook;
 
 //import mod.sparkyfox.servermod.Server;
import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.gui.GuiType;
import mod.sparkyfox.servermod.gui.PacketClient;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
 
 public class ItemRecipeBook extends Item {

	 	public ItemRecipeBook(){
	 		this.setCreativeTab(CreativeTabs.MISC);
	 		this.setMaxStackSize(1);
	 		
	 	}
	 	@Override
	 	public String getUnlocalizedName(ItemStack stack) {
	 		return "RecipeBook" + ServerMod.RESOURCE_PREFIX + ModNames.RecipeBook;
	 	}

	 	
   public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
   {
     ItemStack itemstack = player.getHeldItem(hand);
     if (!world.isRemote) {
     //  Server.sendData((EntityPlayerMP)player, PacketClient.GUI, new Object[] { GuiType.SPARKYRECIPES, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
       return new ActionResult(EnumActionResult.SUCCESS, itemstack);
     }
     return new ActionResult(EnumActionResult.SUCCESS, itemstack);
   }
 }
