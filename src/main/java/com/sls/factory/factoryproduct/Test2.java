package com.sls.factory.factoryproduct;

/**
 * 工厂模式
 * @author sls
 **/
public class Test2 {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.create().create();

        FactoryB factoryB = new FactoryB();
        factoryB.create().create();

    }
}
