/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.buffer.LinkedListBuffer;
import com.kingland.practice.loader.BaseLoader;
import com.kingland.practice.loader.ConsoleLoader;
import com.kingland.practice.loader.FileLoader;
import com.kingland.practice.sender.BaseSender;
import com.kingland.practice.sender.ConsoleSender;
import com.kingland.practice.sender.FileSender;

import java.io.IOException;

/**
 * @author KSC
 * @description Test class for testing the application
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BaseBuffer<String> fileBuffer = new LinkedListBuffer(5);
        BaseBuffer<String> consoleBuffer = new LinkedListBuffer(5);

        int i = 0;
        consoleBuffer.add("Hello, test number: " + ++i);
        consoleBuffer.add("Hello, test number: " + ++i);
        consoleBuffer.add("Hello, test number: " + ++i);

        BaseSender fileSender = new FileSender(fileBuffer, "output.txt");
        BaseLoader fileLoader = new FileLoader(fileBuffer, "input.txt");
        BaseSender consoleSender = new ConsoleSender(consoleBuffer);
        BaseLoader consoleLoader = new ConsoleLoader(consoleBuffer);

        consoleLoader.setPriority(Thread.MIN_PRIORITY);
        consoleSender.setPriority(Thread.MIN_PRIORITY);
        fileSender.setPriority(Thread.MAX_PRIORITY);
        fileLoader.setPriority(Thread.MAX_PRIORITY);

        fileLoader.start();
        fileSender.start();
        consoleLoader.start();
        consoleSender.start();
    }
}
