/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;

/**
 * @author KSC
 * @description
 */
public class FileLoader extends BaseLoader {
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
     * Override the run method which is inherited from Thread class
     */
    @Override
    public void run() {

    }

    /**
     * @return
     */
    @Override
    public Object getData() {
        return "Hello world!";
    }
}
