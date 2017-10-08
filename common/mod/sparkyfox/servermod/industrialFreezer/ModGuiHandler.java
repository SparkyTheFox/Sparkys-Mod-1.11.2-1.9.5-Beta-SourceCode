package mod.sparkyfox.servermod.industrialFreezer;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.block.BlockIndustrialFreezer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {

    public static final int GUI_INDUSTRIAL_FREEZER_ID = 0;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity industrialfreezer = world.getTileEntity(new BlockPos(x, y, z));

        switch (ID) {
            case GUI_INDUSTRIAL_FREEZER_ID:
                return new ContainerIndustrialFreezer(player.inventory, (TileEntityIndustrialFreezer) industrialfreezer);
            default: return null;
        }
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity industrialfreezer = world.getTileEntity(new BlockPos(x, y, z));

        switch (ID) {
            case GUI_INDUSTRIAL_FREEZER_ID:
                return new GuiIndustrialFreezer(player.inventory, (TileEntityIndustrialFreezer) industrialfreezer);
            default: return null;
        }
    }
}

