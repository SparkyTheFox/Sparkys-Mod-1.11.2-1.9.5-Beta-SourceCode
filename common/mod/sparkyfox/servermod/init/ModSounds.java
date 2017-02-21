package mod.sparkyfox.servermod.init;

import com.ibm.icu.impl.duration.impl.Utils;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSounds {

	public static SoundEvent SMG;
	public static SoundEvent SMG2;

	public static void registerSounds(){
	SMG = registerSound("smg.ogg");
	SMG2 = registerSound("smg2.ogg");
	
		
	}
	
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation id = new ResourceLocation(ServerMod.MOD_ID, soundName);
		return GameRegistry.register(new SoundEvent(id).setRegistryName(id));
		
		
		}
		
	}
