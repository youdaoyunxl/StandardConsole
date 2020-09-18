package com.juven.java8.yichang;

public class StackTraceDemo2 {

    public static void main(String[] args) {
        try {
            c();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }

    static void c() {
        try {
            b();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            Throwable t = ex.fillInStackTrace();
            throw (NullPointerException) t;
        }
    }

    private static void b() {
        a();
    }

    private static String a() {
        String text = null;
        return text.toUpperCase();
    }
}
