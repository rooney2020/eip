/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author KSC
 * @description The buffer used Linked List which can add and poll elements
 */
public class LinkedBlockingQueueBuffer<T> implements BaseBuffer<T> {
    /**
     * Use Linked List to store elements
     */
    private final Queue<T> queue;

    /**
     * The max capacity of buffer
     */
    private final int capacity;

    /**
     * Constructor
     *
     * @param capacity set the capacity value for buffer
     */
    public LinkedBlockingQueueBuffer(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            queue = new LinkedBlockingQueue<T>();
        } else {
            throw new BusinessException(Common.CAPACITY_INIT_EXCEPTION);
        }
    }

    /**
     * add the parameter element into buffer
     *
     * @param var1 element to add
     */
    @Override
    public void add(T var1) {
        synchronized (queue) {
            while (queue.size() >= capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(var1);
            queue.notifyAll();
        }
    }

    /**
     * get and remove the first element in buffer
     *
     * @return return the first element
     */
    @Override
    public T poll() {
        T t = null;
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            t = queue.poll();
            queue.notifyAll();
        }
        return t;
    }

    /**
     * Get the number of buffer capacity
     *
     * @return Get the number of buffer capacity
     */
    @Override
    public int size() {
        return queue.size();
    }
}
