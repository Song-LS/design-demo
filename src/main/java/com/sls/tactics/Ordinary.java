package com.sls.tactics;

import java.math.BigDecimal;

/**
 * @author sls
 * 普通客户
 **/
@PriceRegion(min = 10000)
public class Ordinary implements Price {

    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price;
    }
}
