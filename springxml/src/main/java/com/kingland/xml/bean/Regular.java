/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.xml.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author KSC
 */
public class Regular extends Employee {
    /**
     * car
     */
    private Car car;

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
    public void setChildren(List<String> children) {
        this.children = children;
    }

    /**
     * set the houses to regular
     *
     * @param houses houses the regular has
     */
    public void setHouses(Set<String> houses) {
        this.houses = houses;
    }

    /**
     * set the cars to regular
     *
     * @param cars cars the regular has
     */
    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    /**
     * Constructor
     *
     * @param car the car which employee drive to go to work
     */
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
