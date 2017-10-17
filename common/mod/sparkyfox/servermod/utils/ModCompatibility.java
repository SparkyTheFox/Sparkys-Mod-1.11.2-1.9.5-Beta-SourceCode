package mod.sparkyfox.servermod.utils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import mod.sparkyfox.servermod.init.ModBlocks;
//import cpw.mods.fml.common.Loader;
//import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;


public class ModCompatibility
{

    public static boolean isTConstructLoaded = Loader.isModLoaded("tconstruct");
    public static boolean isServerModLoaded = Loader.isModLoaded("servermod");


	
    public static void checkForCompatibleMods()
    {
        
        if (ModCompatibility.isTConstructLoaded)
        {
            ServerModLog.info("Servermod: activating Tinker's Construct compatibility features.");
            ServerModLog.info("ServerMod: activating Tinker's Construct compatibility features.");
            ServerModLog.info("servermod: activating Tinker's Construct compatibility features.");
        }
        
        if (ModCompatibility.isServerModLoaded)
            {
                ServerModLog.info("Servermod: activating ServerMods compatibility features.");
            }
    	}
        public static void registerMicroBlocks()
        {
            try
            {
                Class clazz = Class.forName("codechicken.microblock.MicroMaterialRegistry");
                if (clazz != null)
                {
                    Method registerMethod = null;
                    Method[] methodz = clazz.getMethods();
                    for (Method m : methodz)
                    {
                        if (m.getName().equals("registerMaterial"))
                        {
                            registerMethod = m;
                            break;
                        }
                    }
                    Class<?> clazzbm = Class.forName("codechicken.microblock.BlockMicroMaterial");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 3), "tile.gcBlockCore.decoblock1");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 4), "tile.gcBlockCore.decoblock2");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 9), "tile.gcBlockCore.copperBlock");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 10), "tile.gcBlockCore.tinBlock");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 11), "tile.gcBlockCore.aluminumBlock");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.basicBlock, 12), "tile.gcBlockCore.meteorironBlock");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.blockMoon, 3), "tile.moonBlock.moondirt");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.blockMoon, 4), "tile.moonBlock.moonstone");
                    registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(ModBlocks.NickelBlock), "tile.ModBlocks.NickelBlock");
                    //registerMethod.invoke(null, clazzbm.getConstructor(Block.class, int.class).newInstance(GCBlocks.blockMoon, 14), "tile.moonBlock.bricks");
                    ServerModLog.info("Servermod: activating CodeChicken Microblocks compatibility.");
                }
            }
            catch (Exception e)
            {
            }
        }
    }
