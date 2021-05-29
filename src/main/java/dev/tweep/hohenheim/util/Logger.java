package dev.tweep.hohenheim.util;

import lombok.NonNull;
import org.bukkit.Bukkit;

import java.util.Arrays;

public final class Logger {

    private static final String errorMessage = "Oh no, there was an error while loading hohenheim addon. Please report this stacktrace at the issues tab.";
    private static final java.util.logging.Logger logger = Bukkit.getLogger();

    public static void log(@NonNull String message) {
        logger.info(message);
    }

    public static void error(@NonNull String stacktrace) {
        logger.severe(errorMessage);
        logger.severe(stacktrace);
    }

    public static void error(@NonNull Exception e) {
        logger.severe(errorMessage);
        logger.severe(Arrays.toString(e.getStackTrace()));
    }
}
