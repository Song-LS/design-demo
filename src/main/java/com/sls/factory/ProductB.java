package com.sls.factory;

/**
 * @author sls
 * 产品B
 **/
public class ProductB implements Product {
    @Override
    public void create() {
        System.out.println("产品B");
    }
}
