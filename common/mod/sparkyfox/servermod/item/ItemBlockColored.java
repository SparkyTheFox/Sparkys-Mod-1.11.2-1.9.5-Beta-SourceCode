 package mod.sparkyfox.servermod.item;
 
 import net.minecraft.item.ItemBlock;
 
 public class ItemBlockColored extends ItemBlock
 {
   public ItemBlockColored(net.minecraft.block.Block block)
   {
     super(block);
   }
   
   public int getMetadata(int damage)
   {
     return damage;
   }
 }
