package com.designpattern.creational.abstractFactory;

/**
 *
 * Created by mungo on 17-3-7.
 */
public abstract class AbstractFactory {
    /*
    * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
    *
    * */
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();


}
