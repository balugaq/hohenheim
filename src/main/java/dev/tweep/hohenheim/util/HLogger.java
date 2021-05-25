package dev.tweep.hohenheim.managers;

import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.logging.Logger;

public class LoggingManager {

    private static final String errorMessage = "Oh no, there was an error while loading hohenheim addon. Please report this stacktrace at the issues tab.";
    private static final Logger logger = Bukkit.getLogger();

    public static void log(String message) {
        logger.info(message);
    }

    public static void error(String stacktrace) {
        logger.severe(errorMessage);
        logger.severe(stacktrace);
    }

    public static void error(Exception e) {
        logger.severe(errorMessage);
        logger.severe(Arrays.toString(e.getStackTrace()));
    }
}
