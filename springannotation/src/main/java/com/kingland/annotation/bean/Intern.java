/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author KSC
 */
@Component
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
    @Autowired
    @Qualifier("cheap")
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

    @Override
    public String toString() {
        return "Intern{" +
                "\n\tcar=" + car +
                "\n}";
    }
}
