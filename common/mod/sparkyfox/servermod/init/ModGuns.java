package mod.sparkyfox.servermod.init;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
//import com.mrcrayfish.guns.MrCrayfishGunMod;
//import com.mrcrayfish.guns.item.ItemGun;
//import com.mrcrayfish.guns.item.ItemPart;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.Gun;
import mod.sparkyfox.servermod.item.ItemAmmo;
import mod.sparkyfox.servermod.item.guns.ItemGun;
import mod.sparkyfox.servermod.item.guns.ItemPart;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModGuns
{
	public static final List<ItemGun> GUNS = new ArrayList<>();

	public static Item parts;
	public static Item ammo;

	public static void init()
	{
		Reader reader = new InputStreamReader(ModGuns.class.getResourceAsStream("/assets/cgm/guns.json"));
		Gson gson = new Gson();
		ArrayList<Gun> guns = gson.fromJson(reader, new TypeToken<ArrayList<Gun>>(){}.getType());
		for(Gun gun : guns)
		{
			GUNS.add(new ItemGun(gun));
		}

		//parts = new ItemPart().setCreativeTab(MrCrayfishGunMod.GUN_TAB);
		ammo = new ItemAmmo();
	}

	public static void register()
	{
		for(Item item : GUNS)
		{
			GameRegistry.register(item);
		}
		GameRegistry.register(parts);
		GameRegistry.register(ammo);
	}

	public static void registerRenders()
	{
		for(Item item : GUNS)
		{
			registerRender(item);
		}
		registerMeta();
	}

	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ServerMod.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	private static void registerMeta()
	{
		for(int i = 0; i < ItemPart.PARTS.length; i++)
		{
			ModelLoader.setCustomModelResourceLocation(ModGuns.parts, i, new ModelResourceLocation(ServerMod.MOD_ID + ":" + "part_" + ItemPart.PARTS[i], "inventory"));
		}

		for(int i = 0; i < ItemAmmo.Type.values().length; i++)
        {
            ModelLoader.setCustomModelResourceLocation(ModGuns.ammo, i, new ModelResourceLocation(ServerMod.MOD_ID + ":" + "ammo_" + ItemAmmo.Type.values()[i].name, "inventory"));
        }
	}
}
