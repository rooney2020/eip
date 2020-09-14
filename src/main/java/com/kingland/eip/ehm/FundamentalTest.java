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

    public static void main(String[] args) {
        // first task
        System.out.println("hello world");

        // second task
        print(NUM);

        // third task
        printMonth(MONTH);

        // fourth task
        int length = stringFormat("Good morning");
        if (length % 2 == 0) {
            System.out.println("The length of String is : " + length);
        } else {
            System.out.println("The length of String is Odd number");
        }
    }

    /**
     * This will print some stars, date and time.
     *
     * @param num The number of how many star will be printed out
     */
    public static void print(int num) {
        final String star = "*";
        for (int i = num; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println("localTime: " + LocalDate.now() + " " + LocalTime.now());
    }

    /**
     * This will prints out the corresponding month abbreviation
     *
     * @param num The number of how many star will be printed out
     */
    public static void printMonth(int num) {
        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            default:
                System.out.println("Dec");
                break;
        }
    }

    /**
     * If the original String meets the requirements,  every element in it will be printed out and return the he length of it
     *
     * @param origin The original String
     * @return The length of original String
     */
    public static int stringFormat(String origin) {
        final char space = ' ';
        final char characterG = 'G';

        if (origin.indexOf(space) != -1 && origin.charAt(0) == characterG) {
            String[] stringArray = origin.split(String.valueOf(space));
            for (String character : stringArray) {
                System.out.println(character);
            }
        }
        return origin.length();
    }
}
