package dev.tweep.hohenheim.constants;

import dev.tweep.hohenheim.Hohenheim;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Extras {

    private static final NamespacedKey TRANSMUTATION_CATEGORY_KEY;
    private static final NamespacedKey HERBOLOGY_CATEGORY_KEY;
    private static final NamespacedKey TRANSMUTATION_WAND_KEY;

    private static final CustomItemStack TRANSMUTATION_MENU_ITEM;
    public static final ItemGroup TRANSMUTATION_CATEGORY;
    private static final CustomItemStack HERBOLOGY_MENU_ITEM;
    public static final ItemGroup HERBOLOGY_CATEGORY;
    private static final CustomItemStack TRANSMUTATION_WAND_RECIPE_ITEM;
    public static final RecipeType TRANSMUTATION_WAND_RECIPETYPE;

    static {
        TRANSMUTATION_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "transmutation_category_key");
        TRANSMUTATION_MENU_ITEM = new CustomItemStack(Material.GOLDEN_APPLE, ChatColor.DARK_RED + "嬗变物品");

        HERBOLOGY_CATEGORY_KEY = new NamespacedKey(Hohenheim.getInstance(), "herbology_category_key");
        HERBOLOGY_MENU_ITEM = new CustomItemStack(Material.ROSE_BUSH, ChatColor.GREEN + "草药物品");

        TRANSMUTATION_WAND_KEY = new NamespacedKey(Hohenheim.getInstance(), "transmutation_wand_recipetype");
        TRANSMUTATION_WAND_RECIPE_ITEM = new CustomItemStack(Material.STICK, ChatColor.DARK_RED + "变形魔杖",
                "", ChatColor.RED + ChatColor.ITALIC.toString() + "使用转化配方制造此物品");

        TRANSMUTATION_CATEGORY = new ItemGroup(TRANSMUTATION_CATEGORY_KEY, TRANSMUTATION_MENU_ITEM);
        HERBOLOGY_CATEGORY = new ItemGroup(HERBOLOGY_CATEGORY_KEY, HERBOLOGY_MENU_ITEM);
        TRANSMUTATION_WAND_RECIPETYPE = new RecipeType(TRANSMUTATION_WAND_KEY, TRANSMUTATION_WAND_RECIPE_ITEM);
    }

}
