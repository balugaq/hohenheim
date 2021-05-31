package dev.tweep.hohenheim.tasks;

import dev.tweep.hohenheim.data.PlayerData;
import dev.tweep.hohenheim.managers.EntropyManager;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Iterator;

public class EntropyRegenerationTask extends BukkitRunnable {
    @Override
    public void run() {
        Iterator<PlayerData> iter = EntropyManager.getInstance().getActiveUsers();
        while (iter.hasNext()) {
            PlayerData data = iter.next();
            int entropy = data.getEntropy();
            if (entropy < data.getMaxEntropy()) {
                data.setEntropy(data.getEntropy() + data.getRegenerationRate());
            } else {
                data.setEntropy(data.getMaxEntropy());
            }
        }
    }
}
