/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The base builder to set all attributes of logger
 */
public abstract class LoggerBuilder {
    /**
     * set header
     */
    public abstract void setHeader();

    /**
     * set minLength
     */
    public abstract void setMinLength();

    /**
     * set maxLength
     */
    public abstract void setMaxLength();

    /**
     * return logger
     *
     * @return logger
     */
    public abstract BaseLogger getLogger();
}
