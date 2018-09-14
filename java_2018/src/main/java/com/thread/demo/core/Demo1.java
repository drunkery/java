package com.thread.demo.core;

public class Demo1 {

    private int count;

    public synchronized void increase(){
        if(count == 2){
            try{
                wait();
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName()+":"+count);
        notify();
    }

    public synchronized void decrease(){
        if(count == 0){
            try{
                wait();
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName()+":"+count);
        notify();
    }
}