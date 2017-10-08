package mod.sparkyfox.servermod.industrialFreezer;

import org.lwjgl.opengl.GL11;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class GuiIndustrialFreezer extends GuiContainer
{
	private static final ResourceLocation gui = new ResourceLocation("servermod:textures/gui/container/industrialfreezer.png");
	
    /** The player inventory bound to this GUI. */
    private final InventoryPlayer playerInventory;
    private final IInventory tileFurnace;

    public GuiIndustrialFreezer(InventoryPlayer playerInv, IInventory furnaceInv)
    {
        super(new ContainerIndustrialFreezer(playerInv, furnaceInv));
        this.playerInventory = playerInv;
        this.tileFurnace = furnaceInv;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = this.tileFurnace.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(gui);
        int width = (this.width - this.xSize) / 2;
        int height = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(width, height, 0, 0, this.xSize, this.ySize);

        if (TileEntityFurnace.isBurning(this.tileFurnace))
        {
            int snowflake = this.getBurnLeftScaled(14);
            this.drawTexturedModalRect(width + 56, height + 36 + 12 - snowflake, 176, 13 - snowflake, 15, snowflake + 2);
            /*bright_spark was here*/
            //gui x pos, (width + 56, )
            //gui y pos, (height + 36 + 12)
            //texture x pos, (snowflake, 176)
            //texture y pos, (12 - snowflake,)
            //texture width, (snowflake, 15)
            //texture height (snowflake + 2)
            /*bright_spark was here*/
            
            
            //this.drawTexturedModalRect(width + 56, height + 36 + 12 - snowflake, 176, 12 - snowflake, 14, snowflake + 1);
            //this.drawTexturedModalRect(width + 56[Left/Right], height + 36[Moves Snowflake position Up] + 12[Moves Snowflake position down] - snowflake, 176[Moves Left/Right], 12[Moves Up/Down] - snowflake, 15[WIDTH RIGHT], snowflake + 2[HEIGHT DOWN]);
        }

        int arrow = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(width + 79, height + 34, 176, 14, arrow + 1, 16);
    }

    private int getCookProgressScaled(int pixels)
    {
        int width = this.tileFurnace.getField(2);
        int height = this.tileFurnace.getField(3);
        return height != 0 && width != 0 ? width * pixels / height : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int width = this.tileFurnace.getField(1);

        if (width == 0)
        {
            width = 200;
        }

        return this.tileFurnace.getField(0) * pixels / width;
    }
}