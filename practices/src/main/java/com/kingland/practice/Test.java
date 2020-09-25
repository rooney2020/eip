/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.buffer.LinkedListBuffer;
import com.kingland.practice.loader.BaseLoader;
import com.kingland.practice.loader.FileLoader;
import com.kingland.practice.sender.BaseSender;
import com.kingland.practice.sender.ConsoleSender;

/**
 * @author KSC
 * @description
 */
public class Test {
    public static void main(String[] args) {
        BaseBuffer<String> buffer = new LinkedListBuffer(5);
        System.out.println("mutex: "  + buffer.mutex);
        System.out.println("capacity: " + buffer.capacity);
        System.out.println("remains: " + buffer.remains);

        int i = 0;
        buffer.add("Hello, test number: " + ++i);
        buffer.add("Hello, test number: " + ++i);
        buffer.add("Hello, test number: " + ++i);
        buffer.add("Hello, test number: " + ++i);
        buffer.add("Hello, test number: " + ++i);

        BaseSender sender = new ConsoleSender(buffer);
        BaseLoader loader = new FileLoader(buffer);
        loader.thread = sender;
        loader.start();
        sender.start();
        System.out.println("Start!");
    }
}