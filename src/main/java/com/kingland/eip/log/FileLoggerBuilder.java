/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The logger extends LoggerBuilder to output the log info to Files
 */
public class FileLoggerBuilder extends LoggerBuilder {
    /**
     * base logger
     */
    private BaseLogger baseLogger = new BaseLogger();

    /**
     * set header
     */
    @Override
    public void setHeader() {
        baseLogger.setHeader("FileLogger: ");
    }

    /**
     * set minLength
     */
    @Override
    public void setMinLength() {
        baseLogger.setMinLength(10);
    }

    /**
     * set maxLength
     */
    @Override
    public void setMaxLength() {
        baseLogger.setMaxLength(20);
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
