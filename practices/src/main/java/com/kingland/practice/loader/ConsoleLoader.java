/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.Scanner;

/**
 * @author KSC
 * @description This extends BaseLoader to get data from console
 */
public class ConsoleLoader<T> extends BaseLoader {
    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public ConsoleLoader(BaseBuffer<T> buffer) {
        super(buffer);
    }

    /**
     * get the data which from scanner
     *
     * @return list to send
     */
    @Override
    public T getData() {
        Scanner scanner = new Scanner(System.in);
        return (T) scanner.next();
    }
}
