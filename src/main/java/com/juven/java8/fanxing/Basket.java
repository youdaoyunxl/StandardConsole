package com.juven.java8.fanxing;

import java.util.Arrays;
import java.util.Comparator;

public class Basket<T> {
    public T[] things;

    public Basket(T... things) {
        this.things = things;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(things, comparator);
    }
}
