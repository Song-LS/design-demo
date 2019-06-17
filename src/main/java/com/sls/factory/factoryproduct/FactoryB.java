package com.sls.factory.factoryproduct;

import com.sls.factory.Product;
import com.sls.factory.ProductB;

/**
 * @author sls
 * 创建产品B 的工厂B
 **/
public class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
