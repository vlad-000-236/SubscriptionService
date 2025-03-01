package com.VI__236.SubscriptionService.utills;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConfig {
    private static final Logger logger = LoggerFactory.getLogger(LogConfig.class);

    public void logMethod() {
        logger.info("This is a log message");
    }
}