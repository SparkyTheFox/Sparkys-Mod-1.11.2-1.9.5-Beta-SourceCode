package mod.sparkyfox.servermod.block;


import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class BlockMolten extends BlockModFluid {

  public BlockMolten(Fluid fluid) {
    super(fluid, Material.LAVA);
  }
}
