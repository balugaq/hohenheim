package dev.tweep.hohenheim.managers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dev.tweep.hohenheim.data.PlayerData;
import dev.tweep.hohenheim.util.Logger;
import lombok.NonNull;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PersistentDataManager {

    private static PersistentDataManager instance = null;
    private final HashMap<UUID, PlayerData> persistentEntropyData;

    private PersistentDataManager() {
        persistentEntropyData = load();
    }

    public static PersistentDataManager getInstance() {
        if (instance == null) {
            instance = new PersistentDataManager();
        }
        return instance;
    }

    public PlayerData getPlayerData(@NonNull UUID player) {
        return persistentEntropyData.get(player);
    }

    public void addPlayerData(@NonNull UUID player, @NonNull PlayerData data) {
        persistentEntropyData.put(player, data);
    }

    public void removePlayerData(@NonNull UUID player) {
        persistentEntropyData.remove(player);
    }

    public void save() {
        try {
            Writer writer = Files.newBufferedWriter(Path.of("data.json"));
            new Gson().toJson(persistentEntropyData, writer);
            writer.close();
        } catch (IOException e) {
            Logger.error(e);
        }
    }

    private HashMap<UUID, PlayerData> load() {
        HashMap<UUID, PlayerData> result = new HashMap<>();
        if (new File("data.json").exists()) {
            try {
                Reader reader = Files.newBufferedReader(Path.of("data.json"));
                result = new Gson().fromJson(reader, new TypeToken<Map<String, String>>() {
                }.getType());
                reader.close();
            } catch (IOException e) {
                Logger.error(e);
            }
        }
        return result;
    }

}
