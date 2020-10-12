package com.juven.java8.xiancheng;

import com.sun.xml.internal.bind.v2.TODO;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Thread thread1 = new Thread(() -> {
            while (true) {
                list.add(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                list.add(2);
            }
        });

        thread1.start();
        thread2.start();
    }
}
