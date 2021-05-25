package dev.tweep.hohenheim.entropy;

import java.util.HashMap;
import java.util.UUID;

public final class EntropyManager {

    private HashMap<UUID, >

    public EntropyManager() {

    }

    public static EntropyManager instance = null;

    public static EntropyManager getInstance() {
        if instance == null {
            instance = new EntropyManager();
        }
        return instance;
    }
}
