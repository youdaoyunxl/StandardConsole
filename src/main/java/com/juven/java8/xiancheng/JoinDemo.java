package com.juven.java8.xiancheng;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread start");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadB  开始");
                for(int i=0; i<5; i++) {
                    System.out.println("ThreadB 执行");
                }
                System.out.println("ThreadB 结束");
            }
        });

        threadB.start();
        threadB.join();

        System.out.println("Main Thread 结束");

    }
}
