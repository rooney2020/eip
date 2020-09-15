/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description
 */
public class LoggerDirector {
    public void create(LoggerBuilder builder){
        builder.setHeader();
        builder.setMinLength();
        builder.setMaxLength();
    }
}
