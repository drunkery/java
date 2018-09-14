package com.enumtest.demo.core;

public enum  EnumDemo2 {

    FIRST{
        @Override
        public String getInfo(){
            return "FIRST";
        }
    },
    SECOND{
        @Override
        public String getInfo(){
            return "SECOND";
        }
    };
    public abstract String getInfo();

    //测试
    public static void main(String[] args){
        System.out.println("F:"+EnumDemo2.FIRST.getInfo());
        System.out.println("S:"+EnumDemo2.SECOND.getInfo());
    }
}