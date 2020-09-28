/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

import com.kingland.practice.loader.BaseLoader;
import com.kingland.practice.sender.BaseSender;

/**
 * @author KSC
 * @description The base class of all buffers
 */
public abstract class BaseBuffer<T> {
    /**
     * The max capacity of buffer
     */
    public int capacity;

    /**
     * The number of elements that can be stored in the remaining space
     */
    public int remains;

    /**
     * Add the parameter element into buffer
     *
     * @param var1 element to add
     * @return return the result
     */
    public abstract boolean add(T var1);

    /**
     * Get and remove the first element in buffer
     *
     * @return return the first element
     */
    public abstract T poll();

    /**
     * Produce
     *
     * @param loader loader
     */
    public abstract void produce(BaseLoader<T> loader);

    /**
     * Consume
     *
     * @param sender sender
     */
    public abstract void consume(BaseSender<T> sender);
}
