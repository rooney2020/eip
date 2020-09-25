/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;

/**
 * @author KSC
 * @description
 */
public abstract class BaseSender<T> extends Thread {
    /**
     * The source buffer where sender should get data
     */
    private BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public BaseSender(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public BaseBuffer<T> getBuffer() {
        return buffer;
    }

    /**
     * Override the run method which is inherited from Thread class
     */
    @Override
    public void run() {
        while (true) {
            if (!isBufferEmpty()) {
                T data = (T) getData();
                send(data);
            }
        }
    }

    /**
     * send the data which is got from buffer
     *
     * @param t data to send
     */
    public abstract void send(T t);

    /**
     * Judge whether the buffer is empty
     *
     * @return boolean type result
     */
    public boolean isBufferEmpty() {
        return buffer.remains == buffer.capacity;
    }

    /**
     * get the first element in buffer
     *
     * @return element
     */
    public T getData() {
        return (T) getBuffer().poll();
    }
}
