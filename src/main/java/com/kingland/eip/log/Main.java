/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The main class of the project
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // set corresponding messages and exception
        String consoleMessage = "Message";
        String fileMessage = "Hello, Message";
        String exception = "Exception: NullPointerException";

        // create corresponding loggers
        Logger fileLogger = (Logger) new FileLogger
                .Builder()
                .setMinLength(10)
                .setMaxLength(50)
                .build();
        fileLogger.logger("Exception file");
        fileLogger.logger("Exception file", "Test minimum length");

        Logger consoleLogger = (Logger) new ConsoleLogger
                .Builder()
                .setMinLength(5)
                .setMaxLength(10)
                .build();

        consoleLogger.logger("Exception console");
        consoleLogger.logger("Exception console", "Console test");
    }
}
