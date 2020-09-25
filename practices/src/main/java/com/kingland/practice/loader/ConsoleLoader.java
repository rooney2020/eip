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
    private int num;
    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public ConsoleLoader(BaseBuffer buffer, int num) {
        super(buffer);
    }

    /**
     * @return
     */
    @Override
    public List<T> getData() {
        Scanner scanner = new Scanner(System.in);
        List<T> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add((T) scanner.next());
        }
        return list;
    }
}
