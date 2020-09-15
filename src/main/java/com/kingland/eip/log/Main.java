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
        LoggerDirector director = new LoggerDirector();
        ConsoleLoggerBuilder consoleLoggerBuilder = new ConsoleLoggerBuilder();
        FileLoggerBuilder fileLoggerBuilder = new FileLoggerBuilder();
        director.create(consoleLoggerBuilder);
        director.create(fileLoggerBuilder);
        BaseLogger consoleLogger = consoleLoggerBuilder.getLogger();
        BaseLogger fileLogger = fileLoggerBuilder.getLogger();

        // use consoleLogger to log message
        consoleLogger.log(exception);
        consoleLogger.log(exception, consoleMessage);

        // use fileLogger to log message
        fileLogger.log(exception);
        fileLogger.log(exception, fileMessage);
    }
}
