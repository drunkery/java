package com.map.demo;

import java.util.HashMap;

public class HashMapTest {

    public static final HashMap<String, String> firstHashMap=new HashMap<String, String>();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i=0;i < 25 ;i++){
                    firstHashMap.put(String.valueOf(i),String.valueOf(i));
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                for(int j=0;j < 50 ;j++){
                    firstHashMap.put(String.valueOf(j),String.valueOf(j));
                }
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run(){
                for(int j=50;j < 150 ;j++){
                    firstHashMap.put(String.valueOf(j),String.valueOf(j));
                }
            }
        };

        t1.start();
        t3.start();
        t2.start();

        Thread.currentThread().sleep(1000);
        for(String k : firstHashMap.keySet()){
            if(!k.equals(firstHashMap.get(k))){
                System.out.println(k + " : " + firstHashMap.get(k));
            }
        }
        System.out.println("over");
    }

}