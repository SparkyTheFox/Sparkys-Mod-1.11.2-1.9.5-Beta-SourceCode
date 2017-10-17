package mod.sparkyfox.servermod.fluid;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.Util;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidMolten extends Fluid {
	
	  public static ResourceLocation ICON_MetalStill = Util.getResource(":textures/blocks/fluids/molten_titanium");
	  public static ResourceLocation ICON_MetalFlowing = Util.getResource(":textures/blocks/fluids/molten_titanium_flow");
	 // ServerMod.MOD_ID + ":textures/blocks/fluids/molten_titanium_flow"
	  //public static final FluidMolten instance = new FluidMolten("Titanium", 2000);

	  public FluidMolten(String fluidName, int color) {
	    this(fluidName, color, ICON_MetalStill, ICON_MetalFlowing);
	  }

	  public FluidMolten(String fluidName, int color, ResourceLocation still, ResourceLocation flow) {
	    super(fluidName, still, flow);

	    this.setDensity(2000); // thicker than a bowl of oatmeal
	    this.setViscosity(10000); // sloooow moving
	    this.setTemperature(1000); // not exactly lava, but still hot. Should depend on the material
	    this.setLuminosity(10); // glowy by default!

	    // rare by default
	    setRarity(EnumRarity.UNCOMMON);
	  }
	}