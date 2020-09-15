/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The logger extends BaseLogger to output the log info to Console
 */
public class ConsoleLoggerBuilder extends LoggerBuilder {
    private BaseLogger baseLogger = new BaseLogger();

    /**
     * set header
     */
    @Override
    public void setHeader() {
        baseLogger.setHeader("ConsoleLogger: ");
    }

    /**
     * set minLength
     */
    @Override
    public void setMinLength() {
        baseLogger.setMinLength(5);
    }

    /**
     * set maxLength
     */
    @Override
    public void setMaxLength() {
        baseLogger.setMaxLength(10);
    }

    /**
     * return logger
     *
     * @return logger
     */
    @Override
    public BaseLogger getLogger() {
        return baseLogger;
    }
}
