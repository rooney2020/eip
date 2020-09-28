/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

import com.kingland.practice.loader.BaseLoader;
import com.kingland.practice.sender.BaseSender;
import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author KSC
 * @description The buffer used Linked List which can add and poll elements
 */
public class LinkedListBuffer<T> extends BaseBuffer<T> {
    /**
     * Use Linked List to store elements
     */
    private final Queue<T> queue;

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
     * @return return the result
     */
    @Override
    public boolean add(T var1) {
        if (queue.size() < capacity) {
            boolean bool = queue.add(var1);
            remains = capacity - queue.size();
            return bool;
        } else {
            throw new BusinessException(Common.CAPACITY_EXCEPTION);
        }
    }

    /**
     * get and remove the first element in buffer
     *
     * @return return the first element
     */
    @Override
    public T poll() {
        T t = queue.poll();
        if (null != t) {
            remains = capacity - queue.size();
        } else {
            throw new BusinessException(Common.NULL_ELEMENT_EXCEPTION);
        }
        return t;
    }

    /**
     * produce
     *
     * @param loader loader
     */
    @Override
    public void produce(BaseLoader<T> loader) {
        if (null == loader) {
            throw new BusinessException(Common.PARAMETER_EXCEPTION);
        }
        synchronized (queue) {
            while (remains <= 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = (T) loader.getData();
            add(t);
            queue.notifyAll();
        }
    }

    /**
     * consume
     *
     * @param sender sender
     */
    @Override
    public void consume(BaseSender<T> sender) {
        if (null == sender) {
            throw new BusinessException(Common.PARAMETER_EXCEPTION);
        }
        synchronized (queue) {
            while (queue.size() <= 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = poll();
            sender.send(t);
            queue.notifyAll();
        }
    }
}
