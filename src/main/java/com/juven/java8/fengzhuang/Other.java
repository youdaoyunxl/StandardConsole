package com.juven.java8.fengzhuang;

public class Other {

    static {
        System.out.println("虚拟机加载的时候就会执行哦");
    }

    {
        System.out.println("创建对象的时候，先执行此处：对象初始区块");
    }

    static void doSomeThing() {
        System.out.println("static method do something");
    }

    public Other() {
        System.out.println("Other() 构造函数");
    }

    public Other(int o) {
        this();
        System.out.println("Other(int o) 构造函数");
    }

    public static void main(String[] args) {
        new Other(666);
    }
}
