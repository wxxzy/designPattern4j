package com.designpattern.creational.abstractFactory;

/**
 * Created by mungo on 2017/3/22.
 */
public class Main {
    public static void main(String[] args){
        AbstractFactory factory1 = new CreatorA();
        //AbstractFactory factory2 = new CreatorB();
        AbstractProductA productA = factory1.createProductA();
        AbstractProductB productB = factory1.createProductB();

        productA.doSomething();
        productB.doSomething();
    }

}
