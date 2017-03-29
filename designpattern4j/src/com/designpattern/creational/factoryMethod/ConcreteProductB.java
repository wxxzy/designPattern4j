package com.designpattern.creational.factoryMethod;

/**
 * 实现Product接口。
 * Created by mungo on 2017/3/29.
 */
public class ConcreteProductB implements Product {
    @Override
    public void getProductName() {
        System.out.println("ProductB");
    }

    @Override
    public void getProductColor() {
        System.out.println("ProductB 白色");
    }
}
