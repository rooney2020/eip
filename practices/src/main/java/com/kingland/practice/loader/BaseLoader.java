/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.List;

/**
 * @author KSC
 * @description
 */
public abstract class BaseLoader<T> extends Thread {
    private int num;

    public int getNum() {
        return num;
    }

    /**
     * The designation buffer where loader should store data
     */
    private final BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param num
     * @param buffer set the designation buffer
     */
    public BaseLoader(int num, BaseBuffer buffer) {
        this.num = num;
        this.buffer = buffer;
    }

    public Thread thread;

    /**
     * Override the run method which is inherited from Thread class
     */
    @Override
    public void run() {
        while (true) {
            List<T> data = (List<T>) getData();
            buffer.produce(data);
        }
    }

    /**
     * get data from source
     *
     * @return data to store
     */
    public abstract List<T> getData();

    /**
     * Judge whether buffer is full
     *
     * @return boolean type result
     */
    public boolean isBufferFull() {
        return buffer.remains == 0;
    }
}
