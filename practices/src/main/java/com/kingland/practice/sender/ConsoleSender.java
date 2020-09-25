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
public class ConsoleSender<T> extends BaseSender {
    /**
     * send the data which is got from buffer
     */
    @Override
    public void send(List list) {
        System.out.println(list);
    }

    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public ConsoleSender(int num, BaseBuffer buffer) {
        super(num, buffer);
    }
}
