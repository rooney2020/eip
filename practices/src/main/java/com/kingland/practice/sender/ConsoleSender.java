/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;

/**
 * @author KSC
 * @description
 */
public class ConsoleSender<T> extends BaseSender {
    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public ConsoleSender(BaseBuffer buffer) {
        super(buffer);
    }

    /**
     * send the data which is got from buffer
     * @param t
     */
    @Override
    public void send(Object t) {
        System.out.println(t.toString());
    }
}
