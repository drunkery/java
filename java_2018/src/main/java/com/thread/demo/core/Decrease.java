package com.thread.demo.core;

public class Decrease extends Thread {
    private  Demo1 demo1;

    public Decrease(Demo1 demo1){
        this.demo1 = demo1;
    }

    @Override
    public  void run(){
        for(int i = 0;i < 30; i++){
            try{
                Thread.sleep((long)(Math.random()*500));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            demo1.decrease();
        }
    }
}