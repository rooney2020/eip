/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.log;

/**
 * @author KSC
 * @description The logger extends BaseLogger to output the log info to Console
 */
public class ConsoleLogger extends BaseLogger {
    @Override
    protected void doLog(String log) {
        System.out.println("ConsoleLogger: " + log);
    }

    /**
     * Constructor
     *
     * @param builder builder
     */
    private ConsoleLogger(Builder builder) {
        this.setMaxLength(builder.maxLength);
        this.setMinLength(builder.minLength);
    }

    /**
     * Builder pattern
     */
    public static class Builder {
        private int maxLength;

        private int minLength;

        public ConsoleLogger build() {
            if (minLength > maxLength) {
                throw new IllegalArgumentException("Minimum length and max length not valid");
            }
            return new ConsoleLogger(this);
        }

        public Builder setMaxLength(int maxLength) {
            if (maxLength < 0) {
                throw new IllegalArgumentException("Max length not valid");
            }
            this.maxLength = maxLength;
            return this;
        }

        public Builder setMinLength(int minLength) {
            if (minLength < 0) {
                throw new IllegalArgumentException("Minimum length not valid");
            }
            this.minLength = minLength;
            return this;
        }
    }
}
