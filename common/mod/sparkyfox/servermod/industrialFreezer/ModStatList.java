package mod.sparkyfox.servermod.industrialFreezer;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.stats.StatCrafting;
import net.minecraft.stats.StatList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class ModStatList extends StatList
{

    public static final StatBase INDUSTRIAL_FREEZER_INTERACTION = (new StatBasic("stat.industrialfreezerInteraction", new TextComponentTranslation("stat.industrialfreezerInteraction", new Object[0]))).registerStat();
   
    private static void replaceAllSimilarBlocks(StatBase[] stat, boolean useItemIds)
    {
        mergeStatBases(stat, Blocks.LIT_FURNACE, ModBlocks.IndustrialFreezer, useItemIds);

    }

    private static void mergeStatBases(StatBase[] statBaseIn, Block block1, Block block2, boolean useItemIds)
    {
        int i;
        int j;
        if (useItemIds) {
            i = Item.getIdFromItem(Item.getItemFromBlock(block1));
            j = Item.getIdFromItem(Item.getItemFromBlock(block2));
        } else {
            i = Block.getIdFromBlock(block1);
            j = Block.getIdFromBlock(block2);
        }

        if (statBaseIn[i] != null && statBaseIn[j] == null)
        {
            statBaseIn[j] = statBaseIn[i];
        }
        else
        {
            ALL_STATS.remove(statBaseIn[i]);
            MINE_BLOCK_STATS.remove(statBaseIn[i]);
            BASIC_STATS.remove(statBaseIn[i]);
            statBaseIn[i] = statBaseIn[j];
        }
   
    }
}