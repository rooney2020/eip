/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author KSC
 */
@Component
public class Regular extends Employee {
    /**
     * car
     */
    private Car car;

    /**
     * name
     */
    @Value("Rooney")
    private String name;

    /**
     * children the regular has
     */
    private List<String> children;

    /**
     * houses the regular has
     */
    private Set<String> houses;

    /**
     * cars the regular has
     */
    private Map<String, Car> cars;

    /**
     * set the children to regular
     *
     * @param children children the regular has
     */
    @Autowired
    public void setChildren(List<String> children) {
        this.children = children;
    }

    /**
     * set the houses to regular
     *
     * @param houses houses the regular has
     */
    @Autowired
    public void setHouses(Set<String> houses) {
        this.houses = houses;
    }

    /**
     * set the cars to regular
     *
     * @param cars cars the regular has
     */
    @Autowired
    @Qualifier("expensive")
    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    /**
     * Constructor
     *
     * @param car the car which employee drive to go to work
     */
    @Autowired
    public Regular(Car car) {
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
        return "Regular{\n" +
                "\tcar = " + car +
                ",\n\tchildren = " + children +
                ",\n\thouses = " + houses +
                ",\n\tcars = " + cars +
                "\n}";
    }
}
