package com.sls.tactics;

import java.math.BigDecimal;

/**
 * @author sls
 * 抽象策略
 **/
public interface Price {
    BigDecimal getPrice(BigDecimal price);
}
