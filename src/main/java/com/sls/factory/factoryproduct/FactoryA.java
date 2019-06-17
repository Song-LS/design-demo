package com.sls.factory.factoryproduct;

import com.sls.factory.Product;
import com.sls.factory.Product;
import com.sls.factory.ProductA;

/**
 * @author sls
 * 创建产品A 的工厂A
 **/
public class FactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
