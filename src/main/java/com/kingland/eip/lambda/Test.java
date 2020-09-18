/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.lambda;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author KSC
 * @description
 */
public class Test {
    public static void main(String[] args) {
        List<Artist> artists = new ArrayList();
        artists.add(new Artist("Alan", 10, Profession.SINGER));
        artists.add(new Artist("Alice", 45, Profession.PAINTER));
        artists.add(new Artist("Mike", 63, Profession.SINGER));
        artists.add(new Artist("Helen", 30, Profession.PAINTER));

        Stream<Artist> stream = artists.stream();
        System.out.println("====================== 1 ======================");

        // 1. Find artists whoes name start with A.
        Predicate<Artist> predicate = a -> a.getName().startsWith("A");
        stream.filter(predicate).forEach(a -> System.out.println(a));
        System.out.println("====================== 2 ======================");

        // 2. Get all ages from artists
        Stream<Integer> ages = artists.stream().map(a -> a.getAge());
        ages.forEach(a -> System.out.println(a));
        System.out.println("====================== 3 ======================");

        // 3. Get first two ages from artists
        Stream<Integer> twoAges = artists.stream().map(a -> a.getAge());
        AtomicInteger i = new AtomicInteger();
        twoAges.filter(a -> i.getAndIncrement() < 2).forEach(a -> System.out.println(a));
        System.out.println("====================== 4 ======================");

        // 4. Sort the artist list by age in desc.
        BinaryOperator<Integer> max = (i1, i2) -> i1 > i2 ? i1 : i2;
        Comparator<Artist> comparator = Comparator.comparingInt(Artist::getAge);
        artists.sort(comparator);
        System.out.println(artists);
        System.out.println("====================== 5 ======================");

        // 5. Print artists' name
        Stream<String> names = artists.stream().map(a -> a.getName());
        names.forEach(a -> System.out.println(a));
        System.out.println("====================== 6 ======================");

        // 6. Get all even number ages from artists
        Stream<Integer> evenAges = artists.stream().map(a -> a.getAge()).filter(a -> a % 2 == 0);
        evenAges.forEach(a -> System.out.println(a));
        System.out.println("====================== 7 ======================");

        // 7. Get max age from artists.
        Stream<Integer> maxAge = artists.stream().map(a -> a.getAge());
        System.out.println(maxAge.max(Integer::compareTo).get());
        System.out.println("====================== 8 ======================");

        // 8. Get singer whose age is less than 30.
        Stream<Artist> artistStream = artists.stream().filter(a -> a.getAge() < 30 && a.getProfession().equals(Profession.SINGER));
        artistStream.forEach(a -> System.out.println(a));
        System.out.println("====================== 9 ======================");

        // 9. Get set collection from artists.
        artists.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
        System.out.println("====================== 10 ======================");

        // 10. Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        // Return a List which data should be {1,2,3,4,5,6};
        Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        System.out.println(inputStream.flatMap(a -> a.stream()).collect(Collectors.toList()));
        System.out.println("===================== Date ==========================");
        System.out.println("===================== 1 ==========================");

        // 1. start date 2020/9/13 7:23:23, end date 2020/9/15 13:15:35. Get milliseconds between start date and end date
        Date startDate = new Date("2020/9/13 7:23:23");
        Date endDate = new Date("2020/9/15 13:15:35");
        System.out.println(endDate.getTime() - startDate.getTime());
        System.out.println("===================== 2 ========================");

        //2. Print local current time in format: "yyyy-MM-dd HH:mm:ss"
        Date localTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(localTime));
        System.out.println("===================== 3 ========================");

        //3. Print last Thursday date for given time 2020/9/17, which will be 2020/9/10
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date givenTime = new Date("2020/9/17");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(givenTime);
        calendar.set(Calendar.WEEK_OF_YEAR, calendar.get(Calendar.WEEK_OF_YEAR) - 1);
        calendar.set(Calendar.DAY_OF_WEEK, 5);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println("===================== 4 ========================");

        //4. Transfer Instant to LocalDateTime by using default zoneId.
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime);
        System.out.println("===================== 5 ========================");

        //5. Print year, month and day from current time.
        //Format should be like "Year : %d Month : %d day : %d"
        Calendar c = new GregorianCalendar();
        System.out.println("Year : " + c.get(Calendar.YEAR) + " Month : " + c.get(Calendar.MONTH) + " day : " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("===================== 6 ========================");

        //6. Print date which is one week later from now.
        c.set(Calendar.WEEK_OF_YEAR, c.get(Calendar.WEEK_OF_YEAR) + 1);
        System.out.println(sdf.format(c.getTime()));
    }
}
