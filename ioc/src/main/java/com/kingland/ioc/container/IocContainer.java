/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ioc.container;

/**
 * @author vagrant
 */
public interface IocContainer {
    /**
     * set the bean into container
     *
     * @param cls the type of bean class which you want to set into container
     * @param id the id of bean in container
     * @param args the arguments of constructor
     */
    void setBean(Class cls, String id, ConstructorArg... args);

    /**
     * get the bean from container
     *
     * @param id the id of bean
     * @return bean
     */
    Object getBean(String id);
}
