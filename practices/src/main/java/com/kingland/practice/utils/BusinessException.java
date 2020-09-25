/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.utils;

/**
 * @author KSC
 * @description
 */
public class BusinessException extends RuntimeException{
    public BusinessException(String warningMessage) {
        super(warningMessage);
    }
}
