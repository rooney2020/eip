/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 * @description
 */
public class Benz implements Car {
    public void start() {
        System.out.println("Benz start!");
    }

    public void turnLeft() {
        System.out.println("Benz turn left!");
    }

    public void turnRight() {
        System.out.println("Benz turn right!");
    }

    public void stop() {
        System.out.println("Benz stop!");
    }
}
