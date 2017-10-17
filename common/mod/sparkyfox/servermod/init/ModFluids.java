package mod.sparkyfox.servermod.init;

import com.google.common.eventbus.Subscribe;

import mod.sparkyfox.servermod.CommonProxy;
import mod.sparkyfox.servermod.block.BlockMolten;
import mod.sparkyfox.servermod.fluid.FluidColored;
import mod.sparkyfox.servermod.fluid.FluidMolten;
import mod.sparkyfox.servermod.lib.Material;
import net.minecraft.item.EnumRarity;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


	public class ModFluids {

		@SidedProxy(clientSide = "mod.sparkyfox.servermod.ClientProxy", serverSide = "mod.sparkyfox.servermod.CommonProxy")
		public static CommonProxy proxy;

  // The fluids. Note that just because they exist doesn't mean that they're registered!
  public static FluidMolten Titanium;
  //public static FluidMolten obsidian;
  //public static FluidMolten clay;
  //public static FluidMolten dirt;
  //public static FluidMolten iron;
  //public static FluidMolten gold;
  //public static FluidMolten pigIron;
  //public static FluidMolten cobalt;
  //public static FluidMolten ardite;
  //public static FluidMolten manyullyn;
  //public static FluidMolten knightslime;
  //public static FluidMolten emerald;
  //public static FluidMolten glass;
  //public static FluidColored blood;
  //public static FluidColored milk;
  //public static FluidColored blueslime;
  //public static FluidColored purpleSlime;

  //public static FluidMolten alubrass;

  // Mod Integration fluids
  //public static FluidMolten brass;
  //public static FluidMolten copper;
  //public static FluidMolten tin;
  //public static FluidMolten bronze;
  //public static FluidMolten zinc;
  //public static FluidMolten lead;
  //public static FluidMolten nickel;
  //public static FluidMolten silver;
  //public static FluidMolten electrum;
  //public static FluidMolten steel;
  //public static FluidMolten aluminum;

   static {
	    setupFluids();
     }

   public static void setupFluids() {
    // buuuuckeeeeet
	 FluidRegistry.enableUniversalBucket();
	 

    // Fluids for integration, getting registered by TinkerIntegration
     Titanium = fluidMetal(ModMaterials.Titanium.getIdentifier(), 0xa81212);
     Titanium.setTemperature(769);
     FluidRegistry.addBucketForFluid(Titanium);
     registerMoltenBlock(Titanium);
     FluidRegistry.addBucketForFluid(Titanium);
    // Titanium = FluidMolten.instance;
    }


  private static FluidMolten fluidMetal(Material material) {
    return fluidMetal(material.getIdentifier(), material.materialTextColor);
  }

  private static FluidMolten fluidMetal(String name, int color) {
    FluidMolten fluid = new FluidMolten(name, color);
    return registerFluid(fluid);
  }

  //private static FluidMolten fluidLiquid(String name, int color) {
    //FluidMolten fluid = new FluidMolten(name, color, FluidMolten.ICON_LiquidStill, FluidMolten.ICON_LiquidFlowing);
    //return registerFluid(fluid);
  //}

//  private static FluidColored fluidClassic(String name, int color) {
  //  FluidColored fluid = new FluidColored(name, color, FluidColored.ICON_LiquidStill, FluidColored.ICON_LiquidFlowing);

  //}

  protected static <T extends Fluid> T registerFluid(T fluid) {
    //fluid.setUnlocalizedName(Util.prefix(fluid.getName()));
    FluidRegistry.registerFluid(fluid);

    return fluid;
  }

  /** Registers a non-burning water based block for the fluid */
  //public static BlockFluidBase registerClassicBlock(Fluid fluid) {
  //  BlockFluidBase block = new BlockTinkerFluid(fluid, net.minecraft.block.material.Material.WATER);
//    return registerBlock(block, fluid.getName());
 //{
 

  /** Registers a hot lava-based block for the fluid, prefix with molten_ */
  public static BlockMolten registerMoltenBlock(Fluid fluid) {
    BlockMolten block = new BlockMolten(fluid);
    return registerBlock(block, "molten_" + fluid.getName()); // molten_foobar prefix
  }


private static BlockMolten registerBlock(BlockMolten block, String string) {
	// TODO Auto-generated method stub
	return null;
}
  
}
 