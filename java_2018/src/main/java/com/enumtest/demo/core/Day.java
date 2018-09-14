package com.enumtest.demo.core;

public enum Day {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String desc;

    /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    private Day(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public static void main(String[] args){
        System.out.println(Day.FRIDAY.getDesc());
    }
}