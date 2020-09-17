/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.arraylist;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author KSC
 * @description
 */
public class ReadOnlyArrayList<T> extends ArrayList {
    /**
     * the real arrayList
     */
    private final ArrayList<T> list;

    /**
     * initial the real arrayList with constructor argument
     * @param arrayList initial value
     */
    public ReadOnlyArrayList(ArrayList<T> arrayList) {
        list = arrayList;
    }

    @Override
    public void trimToSize() {
        list.trimToSize();
    }

    @Override
    public void ensureCapacity(int i) {
        list.ensureCapacity(i);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return list.clone();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return list.toArray(objects);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return list.retainAll(collection);
    }

    @Override
    public ListIterator listIterator(int i) {
        return list.listIterator(i);
    }

    @Override
    public ListIterator listIterator() {
        return list.listIterator();
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public List subList(int i, int i1) {
        return list.subList(i, i1);
    }

    @Override
    public void forEach(Consumer consumer) {
        list.forEach(consumer);
    }

    @Override
    public Spliterator spliterator() {
        return list.spliterator();
    }

    @Override
    public boolean equals(Object o) {
        return list.equals(o);
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public boolean containsAll(Collection collection) {
        return list.containsAll(collection);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
//        throw new MyException();
    }

    @Override
    public boolean add(Object o) {
        return false;
//        throw new MyException();
    }

    @Override
    public void add(int i, Object o) {
//        throw new MyException();
    }

    @Override
    public Object remove(int i) {
        return null;
//        throw new MyException();
    }

    @Override
    public boolean remove(Object o) {
        return false;
//        throw new MyException();
    }

    @Override
    public void clear() {
//        throw new MyException();
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
//        throw new MyException();
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
//        throw new MyException();
    }

    @Override
    protected void removeRange(int i, int i1) {
//        throw new MyException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
//        throw new MyException();
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        return false;
//        throw new MyException();
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator) {
//        throw new MyException();
    }

    @Override
    public void sort(Comparator comparator) {
//        throw new MyException();
    }
}
