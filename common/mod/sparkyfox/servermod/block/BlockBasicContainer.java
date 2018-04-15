/*
package mod.sparkyfox.servermod.block;
 
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockContainer;
 import net.minecraft.block.material.Material;
 import net.minecraft.item.ItemBlock;
 import mod.sparkyfox.servermod.CommonProxy;
 import mod.sparkyfox.servermod.ServerMod;

 
 public abstract class BlockBasicContainer extends BlockContainer
 {
   protected BlockBasicContainer(Material materialIn)
   {
     super(materialIn);
     this.setHardness(5.0F);
     this.setResistance(10.0F);
   }
   
   public Block register(String name, int meta, Class<? extends ItemBlock> itemclass)
   {
     setUnlocalizedName(name);
     ServerMod.proxy.registerBlock(this, name, meta, itemclass, seperateMeta());
     return this;
   }
   
   public boolean seperateMeta() {
     return false;
   }
 }
*/