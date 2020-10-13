/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author KSC
 */
@Order(1)
@Component
public class Bmw implements Car {
    /**
     * Constructor
     */
    public Bmw() {
        System.out.println("Purchase a Bmw!");
    }

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
