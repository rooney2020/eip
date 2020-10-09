/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.annotation;

import com.kingland.annotation.bean.Intern;
import com.kingland.annotation.bean.Regular;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author KSC
 */
@ComponentScan("com.kingland.annotation")
public class Main {
    public static void main(String[] args) {
        ApplicationContext appConfig = new AnnotationConfigApplicationContext(AppConfig.class);

        Intern intern = appConfig.getBean("intern", Intern.class);
        intern.work();

        Regular regular = appConfig.getBean("regular", Regular.class);
        regular.work();

        System.out.println(intern.toString());
        System.out.println(regular.toString());
    }
}
