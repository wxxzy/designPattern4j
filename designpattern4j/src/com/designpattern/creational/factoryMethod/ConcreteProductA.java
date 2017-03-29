package com.designpattern.creational.factoryMethod;

/**
 * 实现Product接口。
 * Created by mungo on 2017/3/29.
 */
public class ConcreteProductA implements Product {
    @Override
    public void getProductName() {
        System.out.println("ProductA");
    }

    @Override
    public void getProductColor() {
        System.out.println("ProductA 红色");
    }
}
