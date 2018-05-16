package com.veronika.advanced.loggertest.ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FruitLogger {
    public static final FruitLogger INSTANCE = new FruitLogger();

    static final Logger log = LoggerFactory.getLogger(FruitLogger.class);

    private FruitLogger() { }

    public void logAllFruitMessages(String  message) {
        if (message != null) {
            log.info("Outgoing message: {}", message, message);
        }
    }
}
