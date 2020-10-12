package com.juven.java8.jiekou;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    public static void main(String[] args) {
        Some some = new Some() {
            @Override
            public void doSome() {
                System.out.println("doSome");
            }

            @Override
            public void execute() {
                System.out.println("doExecute");
            }
        };
        some.execute();
        some.doSome();

        Object object = new Object() {
            @Override
            public String toString(){
                return "无聊的语法示范而已";
            }
        };
        System.out.println(object);
        // JDK8的Lambda表达式，简化撰写，前提是接口只定义了一个方法，比如Aciton
        Action action = () ->
        System.out.println("匿名实现Action接口的Execute方法");

        action.execute();
    }
}
