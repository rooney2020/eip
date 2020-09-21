/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.asyn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 * @author KSC
 * @description
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<List<Book>> task = () -> getBookList();
        CompletableFuture<List<Book>> completableFuture = CompletableFuture.supplyAsync(task)
                .thenApply(list -> {
                    for (Book book : list) {
                        book.setScore(getScore(book.getId()));
                    }
                    return list;
                });
        System.out.println(completableFuture.get());
    }

    public static List<Book> getBookList() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(10001L, "C Primer"));
        list.add(new Book(10002L, "Java Language"));
        list.add(new Book(10003L, "Python Language"));
        list.add(new Book(10004L, "PHP Language"));
        return list;
    }

    public static Double getScore(long bookId) {
        Map<Long, Double> map = new HashMap<>();
        map.put(10001L, 8.9);
        map.put(10002L, 9.2);
        map.put(10003L, 8.8);
        map.put(10004L, 8.3);
        return map.get(bookId);
    }
}
