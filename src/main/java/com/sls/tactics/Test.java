package com.sls.tactics;

import java.math.BigDecimal;

/**
 * java策略模式
 * @author sls
 **/
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        PriceContext priceContext = new PriceContext();
        System.out.println(priceContext.getPrice(new BigDecimal(200)));
        System.out.println(priceContext.getPrice(new BigDecimal(11100)));
        System.out.println(priceContext.getPrice(new BigDecimal(30000)));
    }
}
