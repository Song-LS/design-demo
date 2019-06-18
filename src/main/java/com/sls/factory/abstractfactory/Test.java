package com.sls.factory.abstractfactory;

/**
 * 抽象工厂模式
 * @author sls
 **/
public class Test {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        factory.getProductA().create();
        factory.getProductB().create();
    }
}
