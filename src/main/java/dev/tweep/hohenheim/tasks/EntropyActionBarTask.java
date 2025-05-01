package dev.tweep.hohenheim.tasks;

import dev.tweep.hohenheim.data.PlayerData;
import dev.tweep.hohenheim.managers.EntropyManager;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Iterator;

public class EntropyActionBarTask extends BukkitRunnable {
    @Override
    public void run() {
        Iterator<PlayerData> iter = EntropyManager.getInstance().getActiveUsers();
        while (iter.hasNext()) {
            PlayerData data = iter.next();
            Player player = Bukkit.getPlayer(data.getPlayerId());
            String messageToSend = String.format(ChatColor.DARK_PURPLE + "熵: %d, %d", data.getEntropy(), data.getMaxEntropy());
            if (player != null) {
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(messageToSend));
            }
        }
    }
}
