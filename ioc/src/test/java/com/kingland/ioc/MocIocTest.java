/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc;

import com.kingland.ioc.bean.*;
import com.kingland.ioc.container.ConstructorArg;
import com.kingland.ioc.container.IocContainer;
import com.kingland.ioc.container.IocContainerImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MocIocTest {
    private static IocContainer container;

    @BeforeAll
    public static void setUp() {
        container = new IocContainerImpl();
        container.setBean(Benz.class, "benz");
        container.setBean(BMW.class, "bmw");
        ConstructorArg arg = new ConstructorArg(Car.class, "benz");
        container.setBean(Intern.class, "intern", arg);
        ConstructorArg arg2 = new ConstructorArg(Car.class, "bmw");
        container.setBean(Regular.class, "regular", arg2);
    }

    @Test
    public void testIoc() {
        Car benz = (Car) container.getBean("benz");
        Car bmw = (Car) container.getBean("bmw");

        Employee intern = (Employee) container.getBean("intern");
        Employee regular = (Employee) container.getBean("regular");
        benz.start();
        intern.work();
        bmw.start();
        regular.work();
    }
}
