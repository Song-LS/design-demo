package com.sls.factory.abstractfactory;

/**
 * @author sls
 **/
public class Test {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        factory.getProductA().create();
        factory.getProductB().create();
    }
}
