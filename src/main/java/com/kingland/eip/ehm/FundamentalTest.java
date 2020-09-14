/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author KSC
 * @description This class is the first work in EHM.
 */
public class FundamentalTest {

    /**
     * The number of month
     */
    public static final int MONTH = 10;

    /**
     * The number of how many star will be printed out
     */
    public static final int NUM = 10;

    /**
     * The Month abbreviation array
     */
    public static final String[] MONTHNAME = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

    public static void main(String[] args) {
        // first task
        System.out.println("hello world");
        // second task
        print(NUM);
        // third task
        System.out.println(MONTHNAME[MONTH-1]);
        // fourth task
        int length = stringFormat("Good morning");
        if (length%2 == 0) {
            System.out.println("The length of String is : " + length);
        }else {
            System.out.println("The length of String is Odd number");
        }
    }

    /**
     * This will print some stars, date and time.
     * @param num The number of how many star will be printed out
     */
    public static void print(int num) {
        final String STAR = "*";
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(STAR);
            }
            System.out.println();
        }
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("localDate: " + localDate);
        System.out.println("localTime: " + localTime);
    }

    /**
     * If the original String meets the requirements,  every element in it will be printed out and return the he length of it
     * @param origin The original String
     * @return The length of original String
     */
    public static int stringFormat(String origin) {
        final char SPACE = ' ';
        final char characterG = 'G';

        if (origin.indexOf(SPACE) != -1 && origin.charAt(0) == characterG) {
            System.out.println("characterG".toUpperCase());
            String[] stringArray = origin.split(String.valueOf(SPACE));
            for (String character : stringArray) {
                System.out.println(character);
            }
        }
        return origin.length();
    }
}
