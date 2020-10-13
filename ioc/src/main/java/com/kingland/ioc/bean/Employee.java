/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 */
public abstract class Employee {
    /**
     * the car which employee drive to go to work
     */
    private Car car;

    /**
     * Constructor
     *
     * @param car the car which employee drive to go to work
     */
    public Employee(Car car) {
        this.car = car;
    }

    /**
     * work
     */
    public abstract void work();
}
