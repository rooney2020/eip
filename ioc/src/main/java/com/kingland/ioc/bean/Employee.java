/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.bean;

/**
 * @author KSC
 * @description
 */
public abstract class Employee {
    private Car car;

    public Employee(Car car) {
        this.car = car;
    }

    public abstract void work();
}
