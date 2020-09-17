/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author KSC
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // prepare an arrayList
        ArrayList<Employee> array = new ArrayList<>();
        array.add(new Employee(10001, "A", 18));
        array.add(new Employee(10002, "B", 19));
        array.add(new Employee(10003, "C", 20));
        array.add(new Employee(10004, "D", 21));
        array.add(new Employee(10005, "E", 22));

        Employee employee = new Employee(90001, "Z", 100);

        // initial the readOnlyArrayList with the prepared arrayList
        ReadOnlyArrayList<Employee> list = new ReadOnlyArrayList<>(array);
        System.out.println(list.toString());
        // Now, begin the read only test
        list.add(new Employee(10006, "F", 23));
        list.set(0, employee);
        list.add(0, employee);
        list.remove(0);
        list.clear();
        list.addAll(array);
        list.removeRange(0, 1);
        list.removeAll(array);
        list.removeIf(e -> true);
        list.replaceAll(e -> employee.getAge());
        list.sort(Test.COMPARATOR);

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            e.setAge(20);
        }

        System.out.println(list.toString());

    }

    public static final Comparator<Employee> COMPARATOR = Comparator.comparingInt(Employee::getAge);
}
