/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.util;

/**
 * @author KSC
 */
public class BusinessException extends RuntimeException {
    /**
     * Constructor
     *
     * @param message message to print
     */
    public BusinessException(String message) {
        super(message);
    }
}
