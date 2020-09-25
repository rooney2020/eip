/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.Scanner;

/**
 * @author KSC
 * @description
 */
public class ConsoleLoader<T> extends BaseLoader {
    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public ConsoleLoader(BaseBuffer buffer) {
        super(buffer);
    }

    /**
     * @return
     */
    @Override
    public Object getData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
