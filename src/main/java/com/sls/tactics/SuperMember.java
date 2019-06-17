package com.sls.tactics;

import java.math.BigDecimal;

/**
 * @author sls
 **/
@PriceRegion(max = 20000)
public class SuperMember implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.4 + ""));
    }
}
