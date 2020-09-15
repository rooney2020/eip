/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String consoleMessage = "Message";
        String fileMessage = "Hello, Message";
        String exception = "Exception: NullPointerException";

        LoggerDirector director = new LoggerDirector();
        ConsoleLoggerBuilder consoleLoggerBuilder = new ConsoleLoggerBuilder();
        FileLoggerBuilder fileLoggerBuilder = new FileLoggerBuilder();
        director.create(consoleLoggerBuilder);
        director.create(fileLoggerBuilder);
        BaseLogger consoleLogger = consoleLoggerBuilder.getLogger();
        BaseLogger fileLogger = fileLoggerBuilder.getLogger();

        consoleLogger.log(exception);
        consoleLogger.log(exception, consoleMessage);

        fileLogger.log(exception);
        fileLogger.log(exception, fileMessage);
    }
}
