/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KSC
 * @description
 */
public class FileLoader<T> extends BaseLoader {
    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public FileLoader(int num, BaseBuffer buffer) {
        super(num, buffer);
    }

    /**
     * @return
     */
    @Override
    public List<T> getData() {
        List<T> list = new ArrayList<>(getNum());
        for (int i = 0; i < getNum(); i++) {
            list.add((T) "Hello world!");
        }
        return list;
    }
}
