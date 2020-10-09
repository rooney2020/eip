/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.xml.bean;

/**
 * @author KSC
 */
public class Intern extends Employee {
    /**
     * car
     */
    private Car car;

    /**
     * setter
     *
     * @param car car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * work
     */
    @Override
    public void work() {
        System.out.println("Go to work by " + car);
    }
}
