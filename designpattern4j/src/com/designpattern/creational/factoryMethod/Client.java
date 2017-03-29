package com.designpattern.creational.factoryMethod;

/**
 * Created by mungo on 2017/3/29.
 */
public class Client {
    public static void main(String[] args){
        Creator factory = new ConcreteCreator();
        Product productA= factory.createProduct(ConcreteProductA.class);
        Product productB= factory.createProduct(ConcreteProductB.class);
        productA.getProductName();
        productA.getProductColor();
        productB.getProductName();
        productB.getProductColor();
    }
}
