package com.designpattern.creational.abstractFactory;

/**
 * Created by xuhuan on 2017/3/22.
 */
public class ProductB implements AbstractProductB {
    @Override
    public void shareMethod() {
        System.out.println("ProductB shareMethod");
    }

    @Override
    public void doSomething() {
        System.out.println("ProductB doSomething");
    }
}
