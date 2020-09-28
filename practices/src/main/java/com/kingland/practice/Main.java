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
import java.util.concurrent.*;

/**
 * @author KSC
 * @description Test class for testing the application
 */
public class Main {
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

        Runnable fileLoaderRunnable = fileLoader::run;
        Runnable fileSenderRunnable = fileSender::run;
        Runnable consoleLoaderRunnable = consoleLoader::run;
        Runnable consoleSenderRunnable = consoleSender::run;

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<?> future = service.submit(fileLoaderRunnable);
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(fileLoaderRunnable, service);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(fileSenderRunnable, service);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(consoleLoaderRunnable, service);
        CompletableFuture<Void> completableFuture4 = CompletableFuture.runAsync(consoleSenderRunnable, service);
    }
}
