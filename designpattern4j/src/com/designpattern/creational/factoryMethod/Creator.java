package com.designpattern.creational.factoryMethod;

/**
 * 声明工厂方法，该方法返回一个Product类型的对象。
 * Creator也可以定义一个工厂方 法的缺省实现，
 * 它返回一个缺省的ConcreteProduct对象。
 * 可以调用工厂方法以创建一个Product对象。
 * Created by mungo on 2017/3/29.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
