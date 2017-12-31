package mod.sparkyfox.servermod.init;



import mod.sparkyfox.servermod.props.adventure.PropCandy;
import mod.sparkyfox.servermod.props.adventure.PropCandySpill;
import mod.sparkyfox.servermod.props.adventure.PropDummy;
import mod.sparkyfox.servermod.props.adventure.PropHole;
import mod.sparkyfox.servermod.props.adventure.PropHole2;
import mod.sparkyfox.servermod.props.adventure.PropHole3;
import mod.sparkyfox.servermod.props.adventure.PropHole4;
import mod.sparkyfox.servermod.props.adventure.PropMTable;
import mod.sparkyfox.servermod.props.adventure.PropSaveStar;
import mod.sparkyfox.servermod.props.adventure.PropVine;
import mod.sparkyfox.servermod.props.adventure.PropWebBig;
import mod.sparkyfox.servermod.props.adventure.PropWebSmall;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModProps 
{

	public static Block dummy;
	public static Block candy;
	public static Block candyspill;
	public static Block mtable;
	public static Block vine;
	public static Block webbig;
	public static Block websmall;
	public static Block savestar;
	public static Block hole;
	public static Block hole2;
	//public static Block hole3;
	//public static Block hole4;



	public static void init()
	{
		dummy = new PropDummy("dummy", 2.5F, 4.5F, 2);
		candy = new PropCandy("candy", 2.5F, 4.5F, 2);
		candyspill = new PropCandySpill("candyspill", 2.5F, 4.5F, 2);
		mtable = new PropMTable("mtable", 2.5F, 4.5F, 2);
		vine = new PropVine("vine", 2.5F, 4.5F, 2);
		webbig = new PropWebBig("webbig", 2.5F, 4.5F, 2);
		websmall = new PropWebSmall("websmall", 2.5F, 4.5F, 2);
		savestar = new PropSaveStar("savestar", 2.5F, 4.5F, 2);
		hole = new PropHole("hole", 2.5F, 4.5F, 2);
		hole2 = new PropHole2("hole2", 2.5F, 4.5F, 2);
		//hole3 = new PropHole3("hole3", 2.5F, 4.5F, 2);
		//hole4 = new PropHole4("hole4", 2.5F, 4.5F, 2);
		
		

		
	}
	
	public static void register()
	{
		registerBlock(dummy);
		registerBlock(candy);
		registerBlock(candyspill);
		registerBlock(mtable);
		registerBlock(vine);
		registerBlock(webbig);
		registerBlock(websmall);
		registerBlock(savestar);
		registerBlock(hole);
		registerBlock(hole2);
		//registerBlock(hole3);
		//registerBlock(hole4);


	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
