/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

/**
 * @author KSC
 * @description Base Sender
 */
public abstract class BaseSender<T> {
    /**
     * The source buffer where sender should get data
     */
    private final BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public BaseSender(BaseBuffer<T> buffer) {
        if (null == buffer) {
            throw new BusinessException(Common.PARAMETER_EXCEPTION);
        }
        this.buffer = buffer;
    }

    /**
     * Get the source buffer where sender should get data
     *
     * @return The source buffer where sender should get data
     */
    public BaseBuffer<T> getBuffer() {
        return buffer;
    }

    /**
     * the entry point of this class
     */
    public void run() {
        while (true) {
            send(getBuffer().poll());
        }
    }

    /**
     * send the data which is got from buffer
     *
     * @param t element to send
     */
    public abstract void send(T t);
}
