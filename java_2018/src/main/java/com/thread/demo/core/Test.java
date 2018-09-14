package com.thread.demo.core;

public class Test {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Thread t1 = new Increase(demo1);
        Thread t2 = new Decrease(demo1);

        t1.setName("Increase");
        t2.setName("Decrease");

        t1.start();
        t2.start();
    }
}