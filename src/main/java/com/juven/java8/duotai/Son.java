package com.juven.java8.duotai;

/**
 * 1、子类new的时候，会调用父类的构造函数
 * 2、如果子类构造函数中没指定调用父类哪个构造函数，会调用父类无参构造函数
 * 3、如果指定了父类有参构造函数就不会调用父类无参构造函数
 * 4、如果父类没有声明任何构造函数，则系统创建默认无参构造函数
 * 5、如果父类声明了有参构造函数，没有声明无参构造函数，子类调用的时候没有通过super的形式调用有参构造函数就会报错，
 *    因为子类会调用父类无参构造函数，因为父类声明了有参构造函数系统就不会为其默认生成无参构造函数
 */
public class Son extends  Father {

    public Son() {
        //super(10);
        System.out.println("子类构造函数");
    }

    protected void sayHello() {
        System.out.println("Son say hello");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.saySome("look");
    }
}
