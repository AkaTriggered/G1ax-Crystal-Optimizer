package dev.akatriggered.util;

import org.slf4j.LoggerFactory;

public class Logger {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger("G1axCrystalOptimizer");

    public void info(String message) {
        LOGGER.info("[G1axCrystalOptimizer] {}", message);
    }

    public void warn(String message) {
        LOGGER.warn("[G1axCrystalOptimizer] {}", message);
    }

    public void error(String message) {
        LOGGER.error("[G1axCrystalOptimizer] {}", message);
    }

    public void debug(String message) {
        LOGGER.debug("[G1axCrystalOptimizer] {}", message);
    }
}
