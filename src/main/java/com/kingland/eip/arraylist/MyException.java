/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.arraylist;

/**
 * @author KSC
 * @description
 */
public class MyException extends RuntimeException {
    private static final String warningMessage = "Forbidden!";

    public MyException() {
        super(warningMessage);
    }
}
