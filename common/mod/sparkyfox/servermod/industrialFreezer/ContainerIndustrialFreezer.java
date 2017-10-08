package mod.sparkyfox.servermod.industrialFreezer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerIndustrialFreezer extends Container
{
    private final IInventory tileIndustrialFreezer;
    private int freezeTime;
    private int totalFreezeTime;
    private int IndustrialFreezerFreezeTime;
    private int currentItemFreezeTime;

    public ContainerIndustrialFreezer(InventoryPlayer playerInventory, IInventory IndustrialFreezerInventory)
    {
        this.tileIndustrialFreezer = IndustrialFreezerInventory;
        this.addSlotToContainer(new Slot(IndustrialFreezerInventory, 0, 56, 17));
        this.addSlotToContainer(new SlotIndustrialFreezerFuel(IndustrialFreezerInventory, 1, 56, 53));
        this.addSlotToContainer(new SlotIndustrialFreezerOutput(playerInventory.player,IndustrialFreezerInventory, 2, 116, 35));

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
    }

    public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.tileIndustrialFreezer);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = (IContainerListener)this.listeners.get(i);

            if (this.freezeTime != this.tileIndustrialFreezer.getField(2))
            {
                icontainerlistener.sendProgressBarUpdate(this, 2, this.tileIndustrialFreezer.getField(2));
            }

            if (this.IndustrialFreezerFreezeTime != this.tileIndustrialFreezer.getField(0))
            {
                icontainerlistener.sendProgressBarUpdate(this, 0, this.tileIndustrialFreezer.getField(0));
            }

            if (this.currentItemFreezeTime != this.tileIndustrialFreezer.getField(1))
            {
                icontainerlistener.sendProgressBarUpdate(this, 1, this.tileIndustrialFreezer.getField(1));
            }

            if (this.totalFreezeTime != this.tileIndustrialFreezer.getField(3))
            {
                icontainerlistener.sendProgressBarUpdate(this, 3, this.tileIndustrialFreezer.getField(3));
            }
        }

        this.freezeTime = this.tileIndustrialFreezer.getField(2);
        this.IndustrialFreezerFreezeTime = this.tileIndustrialFreezer.getField(0);
        this.currentItemFreezeTime = this.tileIndustrialFreezer.getField(1);
        this.totalFreezeTime = this.tileIndustrialFreezer.getField(3);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tileIndustrialFreezer.setField(id, data);
    }

    /**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.tileIndustrialFreezer.isUsableByPlayer(playerIn);
    }

    /**
     * Take a stack from the specified inventory slot.
     */
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (!IndustrialFreezerRecipes.instance().getFreezingResult(itemstack1).isEmpty())
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (TileEntityIndustrialFreezer.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    
	}
}