package dev.tweep.hohenheim;

import dev.tweep.hohenheim.constants.Items;
import dev.tweep.hohenheim.constants.Recipes;
import dev.tweep.hohenheim.listeners.PlayerEntropySwitchListener;
import dev.tweep.hohenheim.managers.PersistentDataManager;
import dev.tweep.hohenheim.tasks.EntropyActionBarTask;
import dev.tweep.hohenheim.tasks.EntropyRegenerationTask;
import dev.tweep.hohenheim.util.Logger;
import lombok.NonNull;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;


public class Hohenheim extends JavaPlugin implements SlimefunAddon {

    private static Hohenheim instance = null;

    @Override
    public void onEnable() {
        instance = this;

        Items.registerItems();
        Logger.log("All items registered successfully!");

        Recipes.registerEntropyRecipes();
        Logger.log("All entropy recipes registered successfully!");

        registerResearches();

        registerListeners();

        startTasks();

        Logger.log("Successfully loaded hohenheim Slimefun add-on plugin");
    }

    @Override
    public void onDisable() {
        instance = null;
        PersistentDataManager.getInstance().save();
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/TweepCoding/hohenheim/issues";
    }

    @Override
    public @NotNull JavaPlugin getJavaPlugin() {
        return this;
    }

    public static @NonNull Hohenheim getInstance() {
        return instance;
    }

    private void registerResearches() {
        Logger.log("All items registered successfully!");
    }

    private void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new PlayerEntropySwitchListener(), this);
        Logger.log("All listeners registered successfully!");
    }

    private void startTasks() {
        new EntropyActionBarTask().runTaskTimer(this, 0, 20);
        new EntropyRegenerationTask().runTaskTimer(this, 0, 10);
        Logger.log("All tasks started successfully!");
    }

}
