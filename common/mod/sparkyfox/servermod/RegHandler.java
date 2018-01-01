package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModProps;
import mod.sparkyfox.servermod.init.ModSlabs;
import mod.sparkyfox.servermod.init.ModStairs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class RegHandler
{
    @SubscribeEvent
    public static void initItems(Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
       // registry.registerAll(StemItems.getItems());
        registry.registerAll(ModSlabs.getItemBlocks());
        registry.registerAll(ModStairs.getItemBlocks());
        registry.registerAll(ModProps.getItemBlocks());
    }

    @SubscribeEvent
    public static void initBlocks(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.registerAll(ModSlabs.getBlocks());
        registry.registerAll(ModStairs.getBlocks());
        registry.registerAll(ModProps.getBlocks());
        
 

        //StemFluids.init();
        //StemBlocks.regTileEntities();
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void regModels(ModelRegistryEvent event)
    {
      //  StemItems.ITEMS.forEach(ClientUtils::regModel);
    	ModSlabs.BLOCKS.forEach(ClientProxy::regModel);
    	ModStairs.BLOCKS.forEach(ClientProxy::regModel);
    	ModProps.BLOCKS.forEach(ClientProxy::regModel);
      //  ClientUtils.regModel(StemFluids.fluidStem);
    }
}

