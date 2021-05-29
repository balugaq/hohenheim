package dev.tweep.hohenheim.constants;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Recipes {

    public static final ItemStack[] EMPTY_RECIPE = new ItemStack[9];

    public static final ItemStack[] TRANSMUTATION_WAND_RECIPE = new ItemStack[]{
            null, SlimefunItems.ENDER_LUMP_2, null,
            SlimefunItems.ENDER_LUMP_2, SlimefunItems.STAFF_ELEMENTAL, SlimefunItems.ENDER_LUMP_2,
            null, SlimefunItems.ENDER_LUMP_2, null
    };

    public static final ItemStack[] ALCHEMY_GUIDE_RECIPE = new ItemStack[]{
            SlimefunItems.MAGIC_LUMP_2, SlimefunItems.SILVER_DUST, SlimefunItems.MAGIC_LUMP_2,
            SlimefunItems.ENDER_LUMP_2, new ItemStack(Material.BOOK), SlimefunItems.ENDER_LUMP_2,
            SlimefunItems.MAGIC_LUMP_2, SlimefunItems.GOLD_DUST, SlimefunItems.MAGIC_LUMP_2
    };

    public static void registerEntropyRecipes() {

    }
}
