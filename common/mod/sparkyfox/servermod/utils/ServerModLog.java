package mod.sparkyfox.servermod.utils;

import net.minecraftforge.fml.relauncher.FMLRelaunchLog;
import org.apache.logging.log4j.Level;

import mod.sparkyfox.servermod.ServerMod;

public class ServerModLog
{
    public static void info(String message)
    {
        FMLRelaunchLog.log(ServerMod.MOD_NAME, Level.INFO, message);
    }

    public static void severe(String message)
    {
        FMLRelaunchLog.log(ServerMod.MOD_NAME, Level.ERROR, message);
    }

    public static void debug(String message)
    {
        if (ConfigManager.enableDebug)
        {
            FMLRelaunchLog.log(ServerMod.MOD_NAME, Level.INFO, "Debug: " + message);
        }
    }

	public static void exception(Exception e)
	{
		FMLRelaunchLog.log(ServerMod.MOD_NAME, Level.ERROR, e.getMessage());
	}
}
