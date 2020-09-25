/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.List;

/**
 * @author KSC
 * @description
 */
public abstract class BaseSender<T> extends Thread {
    private int num;

    /**
     * The source buffer where sender should get data
     */
    private final BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param num
     * @param buffer set the source buffer
     */
    public BaseSender(int num, BaseBuffer buffer) {
        this.num = num;
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
            getBuffer().consume(num, this);
        }
    }

    /**
     * send the data which is got from buffer
     *
     * @param list list to send
     */
    public abstract void send(List<T> list);
}
