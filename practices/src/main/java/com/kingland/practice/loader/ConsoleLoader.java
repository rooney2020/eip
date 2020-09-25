/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.ArrayList;
import java.util.List;
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
    public ConsoleLoader(int num, BaseBuffer buffer) {
        super(num, buffer);
    }

    /**
     * @return
     */
    @Override
    public List<T> getData() {
        Scanner scanner = new Scanner(System.in);
        List<T> list = new ArrayList<>(getNum());
        for (int i = 0; i < getNum(); i++) {
            list.add((T) scanner.next());
        }
        return list;
    }
}
