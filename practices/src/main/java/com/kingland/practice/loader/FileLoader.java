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
    private int num;

    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public FileLoader(BaseBuffer buffer, int num) {
        super(buffer);
        this.num = num;
    }

    /**
     * @return
     */
    @Override
    public List<T> getData() {
        List<T> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add((T) "Hello world!");
        }
        return list;
    }
}
