package com.juven.java8.fengzhuang;


public class AboutSystemOut {

    static {
        str = "abc";
    }

    /**
     * 当声明了静态常亮，可以再static块做初始化，也可以在构造函数初始化
     * 但如果已初始化哪怕是null，也不能再进行任何初始化了，如：
     * public final static String str = null;
     * public final static String str = "abc";
     */
    public final static String str;

    public static void main(String[] args) {
        System.out.println(AboutSystemOut.str);
    }

}
