package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationLogger {

    private static final Logger logger =
            LoggerFactory.getLogger(ApplicationLogger.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        int availableBalance = 2500;
        int withdrawAmount = 4000;

        if (withdrawAmount > availableBalance) {
            logger.warn("Withdrawal amount is greater than the available balance.");
        }

        try {

            int number = 20 / 0;

        } catch (Exception exception) {

            logger.error("An unexpected error occurred.", exception);

        }

        logger.info("Application finished.");

    }

}