package com.sls.tactics;

import java.math.BigDecimal;

/**
 * @author sls
 * 会员，六折
 **/
@PriceRegion(min = 10000, max = 20000)
public class Member implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.6 + ""));
    }
}
