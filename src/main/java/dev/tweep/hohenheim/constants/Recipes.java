package dev.tweep.hohenheim.constants;

import dev.tweep.hohenheim.data.BlockInputData;
import dev.tweep.hohenheim.data.BlockRecipe;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Recipes {

    public static final ItemStack[] EMPTY_RECIPE;

    public static final ItemStack[] TRANSMUTATION_WAND_RECIPE;

    public static final ItemStack[] ALCHEMY_GUIDE_RECIPE;

    public static final BlockRecipe BELLADONNA_ROOT_RECIPE;
    public static final BlockRecipe MANDRAKE_ROOT_RECIPE;
    public static final BlockRecipe SHIVERTHORN_ROOT_RECIPE;
    public static final BlockRecipe EVIL_EYE_ROOT_RECIPE;

    static {
        EMPTY_RECIPE = new ItemStack[9];

        TRANSMUTATION_WAND_RECIPE = new ItemStack[]{
                null, SlimefunItems.ENDER_LUMP_2, null,
                SlimefunItems.ENDER_LUMP_2, SlimefunItems.STAFF_ELEMENTAL, SlimefunItems.ENDER_LUMP_2,
                null, SlimefunItems.ENDER_LUMP_2, null
        };
        ALCHEMY_GUIDE_RECIPE = new ItemStack[]{
                SlimefunItems.MAGIC_LUMP_2, SlimefunItems.SILVER_DUST, SlimefunItems.MAGIC_LUMP_2,
                SlimefunItems.ENDER_LUMP_2, new ItemStack(Material.BOOK), SlimefunItems.ENDER_LUMP_2,
                SlimefunItems.MAGIC_LUMP_2, SlimefunItems.GOLD_DUST, SlimefunItems.MAGIC_LUMP_2
        };

        BELLADONNA_ROOT_RECIPE = new BlockRecipe(new BlockInputData(Material.ALLIUM, null),
                Items.BELLADONNA_ROOT, 25);
        MANDRAKE_ROOT_RECIPE = new BlockRecipe(new BlockInputData(Material.CACTUS, null),
                Items.MANDRAKE_ROOT, 25);
        SHIVERTHORN_ROOT_RECIPE = new BlockRecipe(new BlockInputData(Material.POPPY, null),
                Items.SHIVERTHORN_ROOT, 25);
        EVIL_EYE_ROOT_RECIPE = new BlockRecipe(new BlockInputData(Material.NETHER_WART, null),
                Items.EVIL_EYE_ROOT, 25);
    }

    public static void registerEntropyRecipes() {
        BELLADONNA_ROOT_RECIPE.register();
        MANDRAKE_ROOT_RECIPE.register();
        SHIVERTHORN_ROOT_RECIPE.register();
        EVIL_EYE_ROOT_RECIPE.register();
    }
}
