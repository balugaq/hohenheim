package dev.tweep.hohenheim.listeners;

import dev.tweep.hohenheim.Hohenheim;
import dev.tweep.hohenheim.managers.EntropyManager;
import lombok.NonNull;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.UUID;

public class PlayerEntropySwitchListener implements Listener {

    private static final EntropyManager entropyManager = EntropyManager.getInstance();

    @EventHandler
    public void onPlayerEntropySwitch(@NonNull PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        UUID playerId = player.getUniqueId();
        ItemStack[] inventoryContents = player.getInventory().getContents();

        ItemStack heldItem = inventoryContents[event.getNewSlot()];
        ItemMeta heldItemMeta = heldItem.getItemMeta();

        NamespacedKey key = new NamespacedKey(Hohenheim.getInstance(), "entropy");

        if (heldItemMeta != null && heldItemMeta.getPersistentDataContainer().has(key, PersistentDataType.BYTE)) {
            entropyManager.addActiveUser(playerId);
        } else if (entropyManager.getActiveUser(playerId) != null) {
            entropyManager.removeActiveUser(playerId);
        }
    }
}
