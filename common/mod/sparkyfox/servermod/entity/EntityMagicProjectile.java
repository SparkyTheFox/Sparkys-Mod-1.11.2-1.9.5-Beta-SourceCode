 package mod.sparkyfox.servermod.entity;
 
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.text.translation.I18n;
 import net.minecraft.world.World;
 
 public class EntityMagicProjectile extends EntityProjectile
 {
   private EntityLivingBase player;
   private ItemStack equiped = ItemStack.EMPTY;
   
   public EntityMagicProjectile(World par1World, EntityLivingBase player, ItemStack item) { super(par1World, player, item);
     
     this.player = player;
     this.equiped = player.getHeldItemMainhand();
   }
   
   public EntityMagicProjectile(World par1World) {
     super(par1World);
   }
   
   public void onUpdate()
   {
     if ((!getEntityWorld().isRemote) && ((this.player == null) || (this.player.getHeldItemMainhand() != this.equiped)))
       setDead();
     super.onUpdate();
   }
   
   public String getName()
   {
     return I18n.translateToLocal("entity.throwableitem.name");
   }
 }
