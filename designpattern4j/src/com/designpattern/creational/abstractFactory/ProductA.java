package com.designpattern.creational.abstractFactory;

/**
 * 产品实现类
 * Created by xuhuan on 2017/3/22.
 */
public class ProductA implements AbstractProductA {
    @Override
    public void shareMethod() {
        System.out.println("ProductA shareMethod");
    }

    @Override
    public void doSomething() {
        System.out.println("ProductA doSomething");
    }
}
