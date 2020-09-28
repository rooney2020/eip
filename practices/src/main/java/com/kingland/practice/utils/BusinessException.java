/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.utils;

/**
 * @author KSC
 * @description The custom business exception
 */
public class BusinessException extends RuntimeException{
    /**
     * Constructor
     *
     * @param warningMessage warning message
     */
    public BusinessException(String warningMessage) {
        super(warningMessage);
    }
}
