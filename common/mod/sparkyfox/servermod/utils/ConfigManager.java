package mod.sparkyfox.servermod.utils;

import com.google.common.primitives.Ints;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.input.Keyboard;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigManager
{
    static Configuration config;

    // GAME CONTROL
    public static boolean enableDebug;
//    public static int mapfactor;
//    public static int mapsize;

    // DIMENSIONS


    // SCHEMATICS


    // ACHIEVEMENTS


    // CLIENT / VISUAL FX


    //DIFFICULTY


    // WORLDGEN
    public static boolean enableOtherModsFeatures;

    //COMPATIBILITY
    public static String[] sealableIDs = {};
    public static String[] detectableIDs = {};
    public static String otherModsSilicon;	
    public static String otherModsTitanium;
    public static String otherModsNickel;
    public static String otherModsBrass;
    public static String otherModsCobalt;

    public static ArrayList<Object> clientSave = null;

    public static void initialize(File file)
    {
        ConfigManager.config = new Configuration(file);
        ConfigManager.syncConfig(true);
    }

    public static void forceSave()
    {
        ConfigManager.config.save();
    }
	
    public static void syncConfig(boolean load)
    		{
            if (!config.isChild)
            {
                if (load)
                {
                    config.load();
                }
            }
        }
    }
