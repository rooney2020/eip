/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 */
public class Intern extends Employee {
    /**
     * Constructor
     *
     * @param car the car which employee drive to go to work
     */
    public Intern(Car car) {
        super(car);
    }

    /**
     * work
     */
    @Override
    public void work() {
        System.out.println("Working eight hours a day brings in 100 yuan!");
    }
}
