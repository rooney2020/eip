/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @author KSC
 */
@Component
public interface Car {
    /**
     * print car start
     */
    void start();

    /**
     * print car turnLeft
     */
    void turnLeft();

    /**
     * print car turnRight
     */
    void turnRight();

    /**
     * print car stop
     */
    void stop();
}
