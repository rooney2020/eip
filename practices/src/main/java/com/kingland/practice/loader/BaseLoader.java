/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

/**
 * @author KSC
 * @description
 */
public abstract class BaseLoader<T> extends Thread {
    /**
     * The designation buffer where loader should store data
     */
    private BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public BaseLoader(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public Thread thread;

    /**
     * Override the run method which is inherited from Thread class
     */
    @Override
    public void run() {
        while (true) {
            if (!isBufferFull()) {
                T data = (T) getData();
                store(data);
                buffer.produce(1);
            }
        }
    }

    /**
     * get data from source
     *
     * @return data to store
     */
    public abstract T getData();

    /**
     * store the data into buffer
     *
     * @param data data to store
     */
    protected void store(T data) {
        buffer.add(data);
    }

    /**
     * Judge whether buffer is full
     *
     * @return boolean type result
     */
    public boolean isBufferFull() {
        return buffer.remains == 0;
    }
}
