/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The director of builder pattern
 */
public class LoggerDirector {
    /**
     * direct builder to build corresponding logger
     *
     * @param builder corresponding builder which kind of logger you want to build
     */
    public void create(LoggerBuilder builder) {
        builder.setHeader();
        builder.setMinLength();
        builder.setMaxLength();
    }
}
