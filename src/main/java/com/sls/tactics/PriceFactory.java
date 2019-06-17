package com.sls.tactics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sls
 * 策略工厂
 **/
class PriceFactory {

    private static final PriceFactory FACTORY = new PriceFactory();

    /**
     * 策略类集合
     */
    private List<Class<? extends Price>> priceList = new ArrayList<>();

    private PriceFactory() {
        // 可以改造成自动获取文件路径
        priceList.add(Member.class);
        priceList.add(Ordinary.class);
        priceList.add(SuperMember.class);
    }

    Price getPrice(BigDecimal price) throws IllegalAccessException, InstantiationException {
        for (Class<? extends Price> clazz : priceList) {
            PriceRegion priceRegion = clazz.getAnnotation(PriceRegion.class);
            if (price.compareTo(new BigDecimal(priceRegion.max())) < 0 && price.compareTo(new BigDecimal(priceRegion.min())) > 0) {
                return clazz.newInstance();
            }
        }
        return null;
    }

    static PriceFactory getInstance() {
        return FACTORY;
    }

}
