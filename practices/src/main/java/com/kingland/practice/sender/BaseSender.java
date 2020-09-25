/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KSC
 * @description
 */
public abstract class BaseSender<T> extends Thread {
    private int num;

    public int getNum() {
        return num;
    }
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
            List<T> list = new ArrayList<>();
            synchronized (buffer) {
                while (buffer.remains - getNum() < 0) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < num; i++) {
                    T t = buffer.poll();
                    System.out.println(t);
                    list.add(t);
                }
                buffer.notifyAll();
            }
            send(list);
        }
    }

    /**
     * send the data which is got from buffer
     */
    public abstract void send(List<T> list);

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
    public List<T> getData() {
        return (List<T>) getBuffer().poll();
    }
}
