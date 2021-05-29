package dev.tweep.hohenheim.managers;

import dev.tweep.hohenheim.data.PlayerData;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public final class EntropyManager {

    private static EntropyManager instance = null;

    private final HashMap<UUID, PlayerData> activeUsers;

    private EntropyManager() {
        activeUsers = new HashMap<>();
    }

    public static EntropyManager getInstance() {
        if (instance == null) {
            instance = new EntropyManager();
        }
        return instance;
    }

    public PlayerData getActiveUser(@NonNull UUID player) {
        return activeUsers.get(player);
    }

    public void addActiveUser(@NonNull UUID player) {
        PlayerData data = PersistentDataManager.getInstance().getPlayerData(player);
        if (data == null) {
            data = new PlayerData(player);
            PersistentDataManager.getInstance().addPlayerData(player, data);
        }
        activeUsers.put(player, data);
    }

    public void removeActiveUser(@NonNull UUID player) {
        activeUsers.remove(player);
    }

    public Iterator<PlayerData> getActiveUsers() {
        return activeUsers.values().iterator();
    }

}
