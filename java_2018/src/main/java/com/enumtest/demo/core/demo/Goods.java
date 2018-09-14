package com.enumtest.demo.core.demo;

public abstract class Goods {

    protected void price(){
        System.out.println("Goods price method...");
        ifTop();
    }

    protected void ifShow(){
        System.out.println("Goods ifShow method...");
    }

    protected abstract void ifTop();

}