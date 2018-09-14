package com.enumtest.demo.core.demo;

public enum  GoodsEnum {
    FOOD("食物", Food.class){
        @Override
        public void check() {
            System.out.println("FOOD CHECK");
        }
    },
    WATER("矿泉水", Water.class){
        @Override
        public void check() {
            System.out.println("WATER CHECK");
        }
    };

    private String name;
    private Goods goods;

    public abstract void check();

    private GoodsEnum(){}

    private GoodsEnum(String name,Class<? extends Goods> clazz){
        this.name = name;
        this.goods = BeanUtils.getBeanSimple(clazz);
    }

    private String getName(){
        return name;
    }

    protected void doSomeThing(){
        check();
        System.out.println("doSomeThing.............");
        this.goods.price();
        this.goods.ifShow();
    }

}