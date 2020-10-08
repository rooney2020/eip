/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 * @description
 */
public class Intern extends Employee {
    public Intern(Car car) {
        super(car);
    }

    @Override
    public void work() {
        System.out.println("Working eight hours a day brings in 100 yuan!");
    }
}
