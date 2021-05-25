package dev.tweep.hohenheim.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class PlayerWandSwitchListener implements Listener {

    @EventHandler
    public void onPlayerWandSwitch(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getContents())
    }
}
