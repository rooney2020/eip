/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 */
public class Benz implements Car {
    /**
     * print car start
     */
    public void start() {
        System.out.println("Benz start!");
    }

    /**
     * print car turnLeft
     */
    public void turnLeft() {
        System.out.println("Benz turn left!");
    }

    /**
     * print car turnRight
     */
    public void turnRight() {
        System.out.println("Benz turn right!");
    }

    /**
     * print car stop
     */
    public void stop() {
        System.out.println("Benz stop!");
    }
}
