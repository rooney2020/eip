/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 * @description
 */
public class BMW implements Car {

    public void start() {
        System.out.println("BMW start!");
    }

    public void turnLeft() {
        System.out.println("BMW turn left!");
    }

    public void turnRight() {
        System.out.println("BMW turn right!");
    }

    public void stop() {
        System.out.println("BMW stop!");
    }
}
