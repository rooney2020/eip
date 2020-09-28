/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

/**
 * @author KSC
 * @description The base class of all buffers
 */
public interface BaseBuffer<T> {
        /**
     * Add the parameter element into buffer
     *
     * @param var1 element to add
     */
    public abstract void add(T var1);

    /**
     * Get and remove the first element in buffer
     *
     * @return return the first element
     */
    public abstract T poll();
}
