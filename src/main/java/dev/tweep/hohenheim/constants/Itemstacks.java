package dev.tweep.hohenheim.constants;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public final class Itemstacks {

    public static final SlimefunItemStack TRANSMUTATION_WAND_ITEMSTACK;
    public static final SlimefunItemStack BELLADONNA_ROOT_ITEMSTACK;
    public static final SlimefunItemStack MANDRAKE_ROOT_ITEMSTACK;
    public static final SlimefunItemStack SHIVERTHORN_ROOT_ITEMSTACK;
    public static final SlimefunItemStack EVIL_EYE_ROOT_ITEMSTACK;
    public static final SlimefunItemStack SOUL_FRAGMENT_ITEMSTACK;
    public static final SlimefunItemStack HOROCRUX_BINDING_ITEMSTACK;
    private static final String SOUL_FRAGMENT_BASE64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly9" +
            "0ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM2ODAyMTY1OGJmYzIxY2NjNDRjZjExZTQwNThmZDE3ZjMzN" +
            "WMyNmE4MjY1ZGQ4NzBkMTkyNGExYThkNmQ2NSJ9fX0=";

    static {
        TRANSMUTATION_WAND_ITEMSTACK = new SlimefunItemStack("TRANSMUTATION_WAND", Material.STICK,
                ChatColor.DARK_RED + "Transmutation Wand",
                "", ChatColor.RED + "Right-Click to change your destiny");
        BELLADONNA_ROOT_ITEMSTACK = new SlimefunItemStack("BELLADONNA_ROOT", Material.JUNGLE_LEAVES,
                ChatColor.LIGHT_PURPLE + "Belladonna Root",
                "", ChatColor.LIGHT_PURPLE + "Smells like an allinium...");
        MANDRAKE_ROOT_ITEMSTACK = new SlimefunItemStack("MANDRAKE_ROOT", Material.SPRUCE_LEAVES,
                ChatColor.DARK_GREEN + "Mandrake Root",
                "", ChatColor.GREEN + "Reminds you of cacti...");
        SHIVERTHORN_ROOT_ITEMSTACK = new SlimefunItemStack("SHIVERTHORN_ROOT", Material.BIRCH_LEAVES,
                ChatColor.AQUA + "Shiverthorn Root",
                "", ChatColor.AQUA + "Similar to poppies in a way...");
        EVIL_EYE_ROOT_ITEMSTACK = new SlimefunItemStack("EVIL_EVE_ROOT", Material.NETHER_WART_BLOCK,
                ChatColor.DARK_RED + "Evil Eye Root",
                "", ChatColor.RED + "Glances at you constantly...",
                "Why did you need to twist nether warts even more?");

        SOUL_FRAGMENT_ITEMSTACK = new SlimefunItemStack("SOUL_FRAGMENT", SOUL_FRAGMENT_BASE64,
                ChatColor.GRAY + "Soul Fragment",
                "", "Ad multorum anima tua");
        HOROCRUX_BINDING_ITEMSTACK = new SlimefunItemStack("HOROCRUX_BINDING", Material.LIGHT_GRAY_DYE,
                ChatColor.RED + "Horocrux Binding",
                "", ChatColor.RED + "Ad caedem et ad vitam aeternam");
    }

}
