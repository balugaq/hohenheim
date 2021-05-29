package dev.tweep.hohenheim.constants;

import dev.tweep.hohenheim.Hohenheim;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Extras {

    private static final NamespacedKey TRANSMUTATION_CATEGORY_KEY;
    private static final NamespacedKey HERBOLOGY_CATEGORY_KEY;
    private static final NamespacedKey TRANSMUTATION_WAND_KEY;

    private static final CustomItem TRANSMUTATION_MENU_ITEM;
    private static final CustomItem HERBOLOGY_MENU_ITEM;
    private static final CustomItem TRANSMUTATION_WAND_RECIPE_ITEM;

    static {
        TRANSMUTATION_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "transmutation_category_key");
        TRANSMUTATION_MENU_ITEM = new CustomItem(Material.GOLDEN_APPLE, ChatColor.DARK_RED + "Transmutation Items");

        HERBOLOGY_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "herbology_category_key");
        HERBOLOGY_MENU_ITEM = new CustomItem(Material.ROSE_BUSH, ChatColor.GREEN + "Herbology Items");

        TRANSMUTATION_WAND_KEY = new NamespacedKey(Hohenheim.getInstance(), "transmutation_wand_recipetype");
        TRANSMUTATION_WAND_RECIPE_ITEM = new CustomItem(Material.STICK, ChatColor.DARK_RED + "Transmutation Wand",
                "", ChatColor.RED + ChatColor.ITALIC.toString() + "Create this item using a transmutation recipe");
    }


    public static final Category TRANSMUTATION_CATEGORY = new Category(TRANSMUTATION_CATEGORY_KEY, TRANSMUTATION_MENU_ITEM);
    public static final Category HERBOLOGY_CATEGORY = new Category(HERBOLOGY_CATEGORY_KEY, HERBOLOGY_MENU_ITEM);

    public static final RecipeType TRANSMUTATION_WAND_RECIPETYPE = new RecipeType(TRANSMUTATION_WAND_KEY, TRANSMUTATION_WAND_RECIPE_ITEM);

}
