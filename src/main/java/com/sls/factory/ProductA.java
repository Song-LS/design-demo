package com.sls.factory;

/**
 * @author sls
 * 产品A
 **/
public class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("产品A");
    }
}
