package com.sls.tactics;

import java.math.BigDecimal;

/**
 * @author sls
 * 上下文
 **/
class PriceContext {
    BigDecimal getPrice(BigDecimal costPrice) throws InstantiationException, IllegalAccessException {
        Price price = PriceFactory.getInstance().getPrice(costPrice);
        return price.getPrice(costPrice);
    }
}
