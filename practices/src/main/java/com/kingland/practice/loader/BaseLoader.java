/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

/**
 * @author KSC
 * @description Base Loader
 */
public abstract class BaseLoader<T> {
    /**
     * The designation buffer where loader should store data
     */
    private final BaseBuffer<T> buffer;

    /**
     * Constructor
     *
     * @param buffer set the designation buffer
     */
    public BaseLoader(BaseBuffer<T> buffer) {
        if (null == buffer) {
            throw new BusinessException(Common.PARAMETER_EXCEPTION);
        }
        this.buffer = buffer;
    }

    /**
     * Get the source buffer where sender should get data
     *
     * @return The source buffer where sender should get data
     */
    public BaseBuffer<T> getBuffer() {
        return buffer;
    }

    /**
     * the entry point of this class
     */
    public void run() {
        while (true) {
            buffer.add(getData());
        }
    }

    /**
     * get data from source
     *
     * @return data to store
     */
    public abstract T getData();

}
