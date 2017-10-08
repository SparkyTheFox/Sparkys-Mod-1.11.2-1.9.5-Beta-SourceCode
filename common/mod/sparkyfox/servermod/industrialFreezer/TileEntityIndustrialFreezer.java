package mod.sparkyfox.servermod.industrialFreezer;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityIndustrialFreezer extends TileEntityLockable implements ITickable, ISidedInventory
{
    private static final int[] SLOTS_TOP = new int[] {0};
    private static final int[] SLOTS_BOTTOM = new int[] {2, 1};
    private static final int[] SLOTS_SIDES = new int[] {1};
    /** The ItemStacks that hold the items currently being used in the industrialfreezer */
    private NonNullList<ItemStack> industrialfreezerItemStacks = NonNullList.<ItemStack>withSize(3, ItemStack.EMPTY);
    /** The number of ticks that the industrialfreezer will keep freezeing */
    private int industrialfreezerFreezeTime;
    /** The number of ticks that a fresh copy of the currently-freezeing item would keep the industrialfreezer freezeing for */
    private int currentItemFreezeTime;
    private int freezeTime;
    private int totalFreezeTime;
    private String industrialfreezerCustomName;

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.industrialfreezerItemStacks.size();
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.industrialfreezerItemStacks)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns the stack in the given slot.
     */
    public ItemStack getStackInSlot(int index)
    {
        return (ItemStack)this.industrialfreezerItemStacks.get(index);
    }

    /**
     * Removes up to a specified number of items from an inventory slot and returns them in a new stack.
     */
    public ItemStack decrStackSize(int index, int count)
    {
        return ItemStackHelper.getAndSplit(this.industrialfreezerItemStacks, index, count);
    }

    /**
     * Removes a stack from the given slot and returns it.
     */
    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.industrialfreezerItemStacks, index);
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int index, ItemStack stack)
    {
        ItemStack itemstack = (ItemStack)this.industrialfreezerItemStacks.get(index);
        boolean flag = !stack.isEmpty() && stack.isItemEqual(itemstack) && ItemStack.areItemStackTagsEqual(stack, itemstack);
        this.industrialfreezerItemStacks.set(index, stack);

        if (stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }

        if (index == 0 && !flag)
        {
            this.totalFreezeTime = this.getFreezeTime(stack);
            this.freezeTime = 0;
            this.markDirty();
        }
    }

    /**
     * Get the name of this object. For players this returns their username
     */
    public String getName()
    {
        return this.hasCustomName() ? this.industrialfreezerCustomName : "container.industrialfreezer";
    }

    /**
     * Returns true if this thing is named
     */
    public boolean hasCustomName()
    {
        return this.industrialfreezerCustomName != null && !this.industrialfreezerCustomName.isEmpty();
    }

    public void setCustomInventoryName(String p_145951_1_)
    {
        this.industrialfreezerCustomName = p_145951_1_;
    }

    public static void registerFixesIndustrialFreezer(DataFixer fixer)
    {
        fixer.registerWalker(FixTypes.BLOCK_ENTITY, new ItemStackDataLists(TileEntityIndustrialFreezer.class, new String[] {"Items"}));
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.industrialfreezerItemStacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, this.industrialfreezerItemStacks);
        this.industrialfreezerFreezeTime = compound.getInteger("FreezeTime");
        this.freezeTime = compound.getInteger("FreezeTime");
        this.totalFreezeTime = compound.getInteger("FreezeTimeTotal");
        this.currentItemFreezeTime = getItemFreezeTime((ItemStack)this.industrialfreezerItemStacks.get(1));

        if (compound.hasKey("CustomName", 8))
        {
            this.industrialfreezerCustomName = compound.getString("CustomName");
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("FreezeTime", (short)this.industrialfreezerFreezeTime);
        compound.setInteger("FreezeTime", (short)this.freezeTime);
        compound.setInteger("FreezeTimeTotal", (short)this.totalFreezeTime);
        ItemStackHelper.saveAllItems(compound, this.industrialfreezerItemStacks);

        if (this.hasCustomName())
        {
            compound.setString("CustomName", this.industrialfreezerCustomName);
        }

        return compound;
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended.
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /**
     * IndustrialFreezer isFreezeing
     */
    public boolean isFreezeing()
    {
        return this.industrialfreezerFreezeTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isFreezeing(IInventory inventory)
    {
        return inventory.getField(0) > 0;
    }

    /**
     * Like the old updateEntity(), except more generic.
     */
    public void update()
    {
        boolean flag = this.isFreezeing();
        boolean flag1 = false;

        if (this.isFreezeing())
        {
            --this.industrialfreezerFreezeTime;
        }

        if (!this.world.isRemote)
        {
            ItemStack itemstack = (ItemStack)this.industrialfreezerItemStacks.get(1);

            if (this.isFreezeing() || !itemstack.isEmpty() && !((ItemStack)this.industrialfreezerItemStacks.get(0)).isEmpty())
            {
                if (!this.isFreezeing() && this.canFreeze())
                {
                    this.industrialfreezerFreezeTime = getItemFreezeTime(itemstack);
                    this.currentItemFreezeTime = this.industrialfreezerFreezeTime;

                    if (this.isFreezeing())
                    {
                        flag1 = true;

                        if (!itemstack.isEmpty())
                        {
                            Item item = itemstack.getItem();
                            itemstack.shrink(1);

                            if (itemstack.isEmpty())
                            {
                                ItemStack item1 = item.getContainerItem(itemstack);
                                this.industrialfreezerItemStacks.set(1, item1);
                            }
                        }
                    }
                }

                if (this.isFreezeing() && this.canFreeze())
                {
                    ++this.freezeTime;

                    if (this.freezeTime == this.totalFreezeTime)
                    {
                        this.freezeTime = 0;
                        this.totalFreezeTime = this.getFreezeTime((ItemStack)this.industrialfreezerItemStacks.get(0));
                        this.freezeItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.freezeTime = 0;
                }
            }
            else if (!this.isFreezeing() && this.freezeTime > 0)
            {
                this.freezeTime = MathHelper.clamp(this.freezeTime - 2, 0, this.totalFreezeTime);
            }

            if (flag != this.isFreezeing())
            {
                flag1 = true;
                ModBlocks.IndustrialFreezer.setState(this.isFreezeing(), this.world, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    public int getFreezeTime(ItemStack stack)
    {
        return 200;
    }

    /**
     * Returns true if the industrialfreezer can freeze an item, i.e. has a source item, destination stack isn't full, etc.
     */
    private boolean canFreeze()
    {
        if (((ItemStack)this.industrialfreezerItemStacks.get(0)).isEmpty())
        {
            return false;
        }
        else
        {
            ItemStack itemstack = IndustrialFreezerRecipes.instance().getFreezingResult((ItemStack)this.industrialfreezerItemStacks.get(0));

            if (itemstack.isEmpty())
            {
                return false;
            }
            else
            {
                ItemStack itemstack1 = (ItemStack)this.industrialfreezerItemStacks.get(2);
                if (itemstack1.isEmpty()) return true;
                if (!itemstack1.isItemEqual(itemstack)) return false;
                int result = itemstack1.getCount() + itemstack.getCount();
                return result <= getInventoryStackLimit() && result <= itemstack1.getMaxStackSize(); // Forge fix: make industrialfreezer respect stack sizes in industrialfreezer recipes
            }
        }
    }

    /**
     * Turn one item from the industrialfreezer source stack into the appropriate freezeed item in the industrialfreezer result stack
     */
    public void freezeItem()
    {
        if (this.canFreeze())
        {
            ItemStack itemstack = (ItemStack)this.industrialfreezerItemStacks.get(0);
            ItemStack itemstack1 = IndustrialFreezerRecipes.instance().getFreezingResult(itemstack);
            ItemStack itemstack2 = (ItemStack)this.industrialfreezerItemStacks.get(2);

            if (itemstack2.isEmpty())
            {
                this.industrialfreezerItemStacks.set(2, itemstack1.copy());
            }
            else if (itemstack2.getItem() == itemstack1.getItem())
            {
                itemstack2.grow(itemstack1.getCount());
            }

            if (itemstack.getItem() == Item.getItemFromBlock(Blocks.ICE) && itemstack.getMetadata() == 1 && !((ItemStack)this.industrialfreezerItemStacks.get(1)).isEmpty() && ((ItemStack)this.industrialfreezerItemStacks.get(1)).getItem() == Items.BUCKET)
            {
                this.industrialfreezerItemStacks.set(1, new ItemStack(Items.WATER_BUCKET));
            }

            itemstack.shrink(1);
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the industrialfreezer freezeing, or 0 if the item isn't
     * fuel
     */
    public static int getItemFreezeTime(ItemStack stack)
    {
        if (stack.isEmpty())
        {
            return 0;
        }
        else
        {
            Item item = stack.getItem();

            if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
            {
                Block block = Block.getBlockFromItem(item);

            }
            if (item == Item.getItemFromBlock(Blocks.PACKED_ICE)) return 20000;
            if (item == Item.getItemFromBlock(Blocks.ICE)) return 2000;
            return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue(stack);
        }
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getItemFreezeTime(stack) > 0;
    }

    /**
     * Don't rename this method to canInteractWith due to conflicts with Container
     */
    public boolean isUsableByPlayer(EntityPlayer player)
    {
        return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player)
    {
    }

    public void closeInventory(EntityPlayer player)
    {
    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot. For
     * guis use Slot.isItemValid
     */
    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        if (index == 2)
        {
            return false;
        }
        else if (index != 1)
        {
            return true;
        }
        else
        {
            ItemStack itemstack = (ItemStack)this.industrialfreezerItemStacks.get(1);
            return isItemFuel(stack) || SlotIndustrialFreezerFuel.isBucket(stack) && itemstack.getItem() != Items.BUCKET;
        }
    }

    public int[] getSlotsForFace(EnumFacing side)
    {
        return side == EnumFacing.DOWN ? SLOTS_BOTTOM : (side == EnumFacing.UP ? SLOTS_TOP : SLOTS_SIDES);
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side.
     */
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
    {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side.
     */
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
    {
        if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.WATER_BUCKET && item != Items.BUCKET)
            {
                return false;
            }
        }

        return true;
    }

    public String getGuiID()
    {
    	return ServerMod.MOD_ID + ":textures/gui/container/industrialfreezer.png";
    }

    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        return new ContainerIndustrialFreezer(playerInventory, this);
    }

    public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.industrialfreezerFreezeTime;
            case 1:
                return this.currentItemFreezeTime;
            case 2:
                return this.freezeTime;
            case 3:
                return this.totalFreezeTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.industrialfreezerFreezeTime = value;
                break;
            case 1:
                this.currentItemFreezeTime = value;
                break;
            case 2:
                this.freezeTime = value;
                break;
            case 3:
                this.totalFreezeTime = value;
        }
    }

    public int getFieldCount()
    {
        return 4;
    }

    public void clear()
    {
        this.industrialfreezerItemStacks.clear();
    }

    net.minecraftforge.items.IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.UP);
    net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.DOWN);
    net.minecraftforge.items.IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.WEST);

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @javax.annotation.Nullable net.minecraft.util.EnumFacing facing)
    {
        if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            if (facing == EnumFacing.DOWN)
                return (T) handlerBottom;
            else if (facing == EnumFacing.UP)
                return (T) handlerTop;
            else
                return (T) handlerSide;
        return super.getCapability(capability, facing);
    }
}
