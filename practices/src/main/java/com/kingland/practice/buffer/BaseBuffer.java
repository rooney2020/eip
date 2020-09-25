/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.buffer;

import java.util.List;

/**
 * @author KSC
 * @description The base class of all buffers
 */
public abstract class BaseBuffer<T> {
    /**
     * The max capacity of buffer
     */
    public int capacity;
    public byte mutex = 1;
    public int remains;

    /**
     * add the parameter element into buffer
     *
     * @param var1 element to add
     * @return return the result
     */
    public abstract boolean add(T var1);

    /**
     * get and remove the first element in buffer
     *
     * @return return the first element
     */
    public abstract T poll();

    /**
     * produce
     *
     * @param list list to load
     */
    public abstract void produce(List list);


    /**
     * consume
     *
     * @param num the number of elements to send
     */
    public abstract void consume(int num);
}
