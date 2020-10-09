/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KSC
 * @description
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
    }
}
