package com.sls.factory.productfactory;

import com.sls.factory.Product;
import com.sls.factory.ProductA;
import com.sls.factory.ProductB;

/**
 * @author sls
 * 产品工厂
 **/
class ProductFactory {
    Product getProduct(Integer type) {
        switch (type) {
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
            default:
                throw new NullPointerException("没你产品");
        }
    }
}
