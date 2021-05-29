package dev.tweep.hohenheim.constants;

import dev.tweep.hohenheim.Hohenheim;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Categories {

    private static final NamespacedKey TRANSMUTATION_CATEGORY_KEY;
    private static final CustomItem TRANSMUTATION_MENU_ITEM;
    private static final NamespacedKey HERBOLOGY_CATEGORY_KEY;
    private static final CustomItem HERBOLOGY_MENU_ITEM;

    static {
        TRANSMUTATION_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "transmutation_category_key");
        TRANSMUTATION_MENU_ITEM = new CustomItem(Material.GOLDEN_APPLE, ChatColor.DARK_RED + "Transmutation Items");

        HERBOLOGY_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "herbology_category_key");
        HERBOLOGY_MENU_ITEM = new CustomItem(Material.ROSE_BUSH, ChatColor.GREEN + "Herbology Items");
    }


    public static final Category TRANSMUTATION_CATEGORY = new Category(TRANSMUTATION_CATEGORY_KEY, TRANSMUTATION_MENU_ITEM);
    public static final Category HERBOLOGY_CATEGORY = new Category(HERBOLOGY_CATEGORY_KEY, HERBOLOGY_MENU_ITEM);

}
