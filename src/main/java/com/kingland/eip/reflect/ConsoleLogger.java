/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.reflect;

/**
 * @author KSC
 * @description
 */
public class ConsoleLogger {
    /**
     * The minimum length of message
     */
    private int minLength;

    /**
     * The maximum length of message
     */
    private int maxLength;

    /**
     * This method can print out exception
     *
     * @param exception exception
     */
    private void logger(String exception) throws Exception {
        validException(exception);
        System.out.println(exception);
    }

    /**
     * Verify that the exception meets the requirements
     *
     * @param exception exception
     * @throws Exception Exception
     */
    private void validException(String exception) throws Exception {
        final String EXCEPTION = "Exception";
        if (null == exception || !exception.startsWith(EXCEPTION)) {
            throw new Exception("Exception does not conform to the rules!" + null == exception ? "null" : "start error");
        }
    }
}
