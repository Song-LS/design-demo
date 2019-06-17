package com.sls.factory.factoryproduct;

import com.sls.factory.Product;

/**
 * @author sls
 * 抽象工厂
 **/
public interface Factory {
    /**
     * 生产产品
     */
    Product create();
}
