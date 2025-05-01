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
        TRANSMUTATION_WAND_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_TRANSMUTATION_WAND", Material.STICK,
        ChatColor.DARK_RED + "炼金魔杖",
        "", ChatColor.RED + "右键 改变你的命运");
        BELLADONNA_ROOT_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_BELLADONNA_ROOT", Material.JUNGLE_LEAVES,
        ChatColor.LIGHT_PURPLE + "颠茄根",
        "", ChatColor.LIGHT_PURPLE + "闻起来像是一种全尼……");
        MANDRAKE_ROOT_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_MANDRAKE_ROOT", Material.SPRUCE_LEAVES,
        ChatColor.DARK_GREEN + "曼德拉根",
        "", ChatColor.GREEN + "让你想起了仙人掌……");
        SHIVERTHORN_ROOT_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_SHIVERTHORN_ROOT", Material.BIRCH_LEAVES,
        ChatColor.AQUA + "寒刺根",
        "", ChatColor.AQUA + "有点像罂粟……");
        EVIL_EYE_ROOT_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_EVIL_EVE_ROOT", Material.NETHER_WART_BLOCK,
        ChatColor.DARK_RED + "邪眼根",
        "", ChatColor.RED + "它一直在注视着你……",
        "为什么你还要诡异的下界疣？");

        SOUL_FRAGMENT_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_SOUL_FRAGMENT", SOUL_FRAGMENT_BASE64,
        ChatColor.GRAY + "灵魂碎片",
        "", "这是许多人的灵魂");
        HOROCRUX_BINDING_ITEMSTACK = new SlimefunItemStack("HOHENHEIM_HOROCRUX_BINDING", Material.LIGHT_GRAY_DYE,
        ChatColor.RED + "魂器绑定",
        "", ChatColor.RED + "通往死亡与永恒的生命");
    }

}
