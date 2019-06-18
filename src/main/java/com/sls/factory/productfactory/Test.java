package com.sls.factory.productfactory;

import com.sls.factory.Product;

/**
 * 简单工厂
 * @author sls
 **/
public class Test {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product productA = factory.getProduct(1);
        productA.create();
        Product productB = factory.getProduct(2);
        productB.create();
    }
}
