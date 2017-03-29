package com.designpattern.creational.abstractFactory;

/**
 * 产品创建
 * Created by mungo on 2017/3/22.
 */
public class CreatorA extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB();
    }
}
