package mod.sparkyfox.servermod.industrialFreezer;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import mod.sparkyfox.servermod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IndustrialFreezerRecipes
{
    private static final IndustrialFreezerRecipes FREEZING_BASE = new IndustrialFreezerRecipes();
    /** The list of Freezing results. */
    private final Map<ItemStack, ItemStack> FreezingList = Maps.<ItemStack, ItemStack>newHashMap();
    /** A list which contains how many experience points each recipe output will give. */
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    /**
     * Returns an instance of FurnaceRecipes.
     */
    public static IndustrialFreezerRecipes instance()
    {
        return FREEZING_BASE;
    }

    private IndustrialFreezerRecipes()
    {
    	
    	this.addFreezing(ModItems.Techite, new ItemStack(ModItems.ColdTechite), 0.1F);
    	
    	
    	/*
    	this.addFreezingRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7F);
        this.addFreezingRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7F);
        this.addFreezingRecipeForBlock(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1.0F);
        this.addFreezingRecipeForBlock(Blocks.DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
        this.addFreezingRecipeForBlock(Blocks.SAND, new ItemStack(Blocks.GLASS), 0.1F);
        this.addFreezing(Items.PORKCHOP, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
        this.addFreezing(Items.BEEF, new ItemStack(Items.COOKED_BEEF), 0.35F);
        this.addFreezing(Items.CHICKEN, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
        this.addFreezing(Items.RABBIT, new ItemStack(Items.COOKED_RABBIT), 0.35F);
        this.addFreezing(Items.MUTTON, new ItemStack(Items.COOKED_MUTTON), 0.35F);
        this.addFreezingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.STONE), 0.1F);
        this.addFreezingRecipe(new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.CRACKED_META), 0.1F);
        this.addFreezing(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.3F);
        this.addFreezingRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
        this.addFreezingRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
        this.addFreezingRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addFreezingRecipeForBlock(Blocks.LOG2, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addFreezingRecipeForBlock(Blocks.EMERALD_ORE, new ItemStack(Items.EMERALD), 1.0F);
        this.addFreezing(Items.POTATO, new ItemStack(Items.BAKED_POTATO), 0.35F);
        this.addFreezingRecipeForBlock(Blocks.NETHERRACK, new ItemStack(Items.NETHERBRICK), 0.1F);
        this.addFreezingRecipe(new ItemStack(Blocks.SPONGE, 1, 1), new ItemStack(Blocks.SPONGE, 1, 0), 0.15F);
        this.addFreezing(Items.CHORUS_FRUIT, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);
        this.addFreezingRecipeForBlock(Blocks.COAL_ORE, new ItemStack(Items.COAL), 0.1F);
        this.addFreezingRecipeForBlock(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7F);
        this.addFreezingRecipeForBlock(Blocks.LAPIS_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), 0.2F);
        this.addFreezingRecipeForBlock(Blocks.QUARTZ_ORE, new ItemStack(Items.QUARTZ), 0.2F);
        this.addFreezing(Items.CHAINMAIL_CHESTPLATE, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.CHAINMAIL_LEGGINGS, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.CHAINMAIL_BOOTS, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_PICKAXE, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_SHOVEL, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_AXE, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_HOE, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_SWORD, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_HELMET, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_CHESTPLATE, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_LEGGINGS, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_BOOTS, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.IRON_HORSE_ARMOR, new ItemStack(Items.field_191525_da), 0.1F);
        this.addFreezing(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addFreezing(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        */
    }

    /**
     * Adds a Freezing recipe, where the input item is an instance of Block.
     */
    public void addFreezingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addFreezing(Item.getItemFromBlock(input), stack, experience);
    }

    /**
     * Adds a Freezing recipe using an Item as the input item.
     */
    public void addFreezing(Item input, ItemStack stack, float experience)
    {
        this.addFreezingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    /**
     * Adds a Freezing recipe using an ItemStack as the input for the recipe.
     */
    public void addFreezingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getFreezingResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.info("Ignored Freezing recipe with conflicting input: " + input + " = " + stack); return; }
        this.FreezingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    /**
     * Returns the Freezing result of an item.
     */
    public ItemStack getFreezingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.FreezingList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return (ItemStack)entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }

    /**
     * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
     */
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getFreezingList()
    {
        return this.FreezingList;
    }

    public float getFreezingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }

        return 0.0F;
    }
}