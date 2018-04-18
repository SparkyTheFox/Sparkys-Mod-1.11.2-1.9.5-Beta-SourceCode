package mod.sparkyfox.servermod.industrialFreezer;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.CarpentryBench.BlockCarpentryBench;
import mod.sparkyfox.servermod.CarpentryBench.ContainerCarpentryBench;
import mod.sparkyfox.servermod.CarpentryBench.GuiCarpentryBench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {

    public static final int GUI_INDUSTRIAL_FREEZER_ID = 0;
    public static final int GUI_CARPENTRY_BENCH_ID = 1;

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
    public Object getServerGuiElement1(int ID, EntityPlayer player, World world, int x, int y, int z) {
        IBlockState carpentrybench = world.getBlockState(new BlockPos(x, y, z));

        switch (ID) {
            case GUI_CARPENTRY_BENCH_ID:
                return new ContainerCarpentryBench(player.inventory, (BlockCarpentryBench) carpentrybench, world, null);
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
    
    @Nullable
    public Object getClientGuiElement1(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	IBlockState carpentrybench = world.getBlockState(new BlockPos(x, y, z));

        switch (ID) {
            case GUI_CARPENTRY_BENCH_ID:
                return new GuiCarpentryBench(player.inventory, world, (BlockCarpentryBench) carpentrybench);
            default: return null;
        }
        }
}

