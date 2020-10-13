/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 */
public class Regular extends Employee {
    /**
     * Constructor
     *
     * @param car the car which employee drive to go to work
     */
    public Regular(Car car) {
        super(car);
    }

    /**
     * work
     */
    @Override
    public void work() {
        System.out.println("Working eight hours a day brings in lots of money!");
    }
}
