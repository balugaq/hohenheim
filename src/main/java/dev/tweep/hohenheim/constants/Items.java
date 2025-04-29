package dev.tweep.hohenheim.constants;

import dev.tweep.hohenheim.Hohenheim;
import dev.tweep.hohenheim.items.transmutation.AlchemyGuide;
import dev.tweep.hohenheim.items.transmutation.TransmutationWand;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public final class Items {

    public static final TransmutationWand TRANSMUTATION_WAND;
    public static final SlimefunItem BELLADONNA_ROOT;
    public static final SlimefunItem MANDRAKE_ROOT;
    public static final SlimefunItem SHIVERTHORN_ROOT;
    public static final SlimefunItem EVIL_EYE_ROOT;
    public static final AlchemyGuide ALCHEMY_GUIDE;
    public static final SlimefunItem SOUL_FRAGMENT;
    public static final SlimefunItem HOROCRUX_BINDING;

    static {
        TRANSMUTATION_WAND = new TransmutationWand(Extras.TRANSMUTATION_CATEGORY,
                Itemstacks.TRANSMUTATION_WAND_ITEMSTACK, RecipeType.ANCIENT_ALTAR, Recipes.TRANSMUTATION_WAND_RECIPE);

        BELLADONNA_ROOT = new SlimefunItem(Extras.HERBOLOGY_CATEGORY,
                Itemstacks.BELLADONNA_ROOT_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);
        MANDRAKE_ROOT = new SlimefunItem(Extras.HERBOLOGY_CATEGORY,
                Itemstacks.MANDRAKE_ROOT_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);
        SHIVERTHORN_ROOT = new SlimefunItem(Extras.HERBOLOGY_CATEGORY,
                Itemstacks.SHIVERTHORN_ROOT_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);
        EVIL_EYE_ROOT = new SlimefunItem(Extras.HERBOLOGY_CATEGORY,
                Itemstacks.EVIL_EYE_ROOT_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);

        ALCHEMY_GUIDE = new AlchemyGuide(Extras.TRANSMUTATION_CATEGORY,
                RecipeType.ANCIENT_ALTAR, Recipes.TRANSMUTATION_WAND_RECIPE);

        SOUL_FRAGMENT = new SlimefunItem(Extras.TRANSMUTATION_CATEGORY,
                Itemstacks.SOUL_FRAGMENT_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);
        HOROCRUX_BINDING = new SlimefunItem(Extras.TRANSMUTATION_CATEGORY,
                Itemstacks.HOROCRUX_BINDING_ITEMSTACK, Extras.TRANSMUTATION_WAND_RECIPETYPE, Recipes.EMPTY_RECIPE);

    }

    public static void registerItems() {
        Hohenheim instance = Hohenheim.getInstance();

        TRANSMUTATION_WAND.register(instance);
        BELLADONNA_ROOT.register(instance);
        MANDRAKE_ROOT.register(instance);
        SHIVERTHORN_ROOT.register(instance);
        EVIL_EYE_ROOT.register(instance);
        SOUL_FRAGMENT.register(instance);
        HOROCRUX_BINDING.register(instance);
    }
}
