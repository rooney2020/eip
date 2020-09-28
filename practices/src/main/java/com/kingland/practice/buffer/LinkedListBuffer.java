/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author KSC
 * @description The buffer used Linked List which can add and poll elements
 */
public class LinkedListBuffer<T> implements BaseBuffer<T> {
    /**
     * Use Linked List to store elements
     */
    private final Queue<T> queue;

    /**
     * The max capacity of buffer
     */
    private final int capacity;

    /**
     * The number of elements that can be stored in the remaining space
     */
    private int remains;

    /**
     * Constructor
     *
     * @param capacity set the capacity value for buffer
     */
    public LinkedListBuffer(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            remains = capacity;
            queue = new LinkedList<T>();
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
            while (queue.size() > capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(var1);
            remains = capacity - queue.size();
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
            if (null != t) {
                remains = capacity - queue.size();
            } else {
                throw new BusinessException(Common.NULL_ELEMENT_EXCEPTION);
            }
            queue.notifyAll();
        }
        return t;
    }
}
