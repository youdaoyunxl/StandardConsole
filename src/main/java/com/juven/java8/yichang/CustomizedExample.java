package com.juven.java8.yichang;

public class CustomizedExample {

    /**
     * 抛出运行时异常，编译器并没有强制在方法上进行throw，因此main函数中的调用方也不会让你对异常进行捕获
     * 当然你可以选择try catch 进行补货，以达到程序处理的目的
     */
    public void doSome(){
        try{
            int a = 0;
            int b = 10;
            System.out.println(b/a);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomizedException("error message is ...");
        }
    }

    public static void main(String[] args) {
        CustomizedExample example = new CustomizedExample();
        example.doSome();
    }

}
