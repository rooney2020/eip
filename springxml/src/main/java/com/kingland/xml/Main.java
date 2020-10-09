/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.xml;

import com.kingland.xml.bean.Intern;
import com.kingland.xml.bean.Regular;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KSC
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Intern intern = appContext.getBean("intern", Intern.class);
        intern.work();

        Regular regular = appContext.getBean("regular", Regular.class);
        regular.work();
        System.out.println(regular.toString());
    }
}
