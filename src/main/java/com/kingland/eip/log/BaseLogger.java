/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The base class of all loggers
 */
public abstract class BaseLogger implements Logger {
    /**
     * The minimum length of message
     */
    private int minLength;

    /**
     * The maximum length of message
     */
    private int maxLength;

    /**
     * set minLength
     *
     * @param minLength The minimum length of message
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    /**
     * set maxLength
     *
     * @param maxLength The maximum length of message
     */
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * This method can print out exception
     *
     * @param exception exception
     */
    @Override
    public void logger(String exception) throws Exception {
        validException(exception);
        doLog(exception);
    }

    /**
     * This method can print out exception and message
     *
     * @param exception exception
     * @param message   message
     */
    @Override
    public void logger(String exception, String message) throws Exception {
        validMessage(message);
        doLog(message);
        logger(exception);
    }

    /**
     * Actual log the message
     *
     * @param log log message
     */
    protected abstract void doLog(String log);

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

    /**
     * Verify that the message meets the requirements
     *
     * @param message message
     * @throws Exception Exception
     */
    private void validMessage(String message) throws Exception {
        if (null == message || message.length() < minLength || message.length() > maxLength) {
            throw new Exception("Message does not conform to the rules!" + null == message ? "null" : String.valueOf(message.length()));
        }
    }
}
