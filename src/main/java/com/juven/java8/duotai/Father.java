package com.juven.java8.duotai;

public class Father {

    public Father() {
        System.out.println("父类构造函数");
    }

    public Father(int i)    {
        System.out.println("父类有参构造函数：" + i);
    }

    protected void sayHello() {
        System.out.println("Father say hello");
    }

    protected void saySome(String str) {
        System.out.println("Say " + str);
        sayHello();
    }
}
