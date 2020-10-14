/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;

/**
 * @author KSC
 * @description This extends BaseSender to send data into console
 */
public class ConsoleSender<T> extends BaseSender {
    /**
     * send the data which is got from buffer
     *
     * @param t element to send
     */
    @Override
    public void send(Object t) {
        System.out.println(t.toString());
    }

    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public ConsoleSender(BaseBuffer<T> buffer) {
        super(buffer);
    }
}
