/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The base builder to set all attributes of logger
 */
public interface Logger {
    /**
     *
     * @param exception
     */
    void logger(String exception) throws Exception;

    /**
     *
     * @param exception
     * @param message
     */
    void logger(String exception, String message) throws Exception;

}
