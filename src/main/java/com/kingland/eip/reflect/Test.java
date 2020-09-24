/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author KSC
 * @description
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class loggerClass = ConsoleLogger.class;
        Constructor constructor = loggerClass.getDeclaredConstructor(int.class, int.class);
        constructor.setAccessible(true);
        ConsoleLogger consoleLogger = (ConsoleLogger) constructor.newInstance(20, 10);
        Field maxField = loggerClass.getDeclaredField("maxLength");
        Field minField = loggerClass.getDeclaredField("minLength");
        Method loggerMethod = loggerClass.getDeclaredMethod("logger", String.class);

        maxField.setAccessible(true);
        minField.setAccessible(true);
        loggerMethod.setAccessible(true);

        maxField.setInt(consoleLogger, 20);
        minField.setInt(consoleLogger, 10);
        loggerMethod.invoke(consoleLogger, "Exception 123456");
    }
}
