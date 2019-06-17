package com.sls.factory.abstractfactory;

/**
 * @author sls
 **/
public class FactoryA implements Factory {
    @Override
    public Product getProductA() {
        return new ProductAa();
    }

    @Override
    public Product getProductB() {
        return new ProductBb();
    }
}
