package com.sls.adapter;

/**
 * 刷卡器
 * @author sls
 **/
public interface CardMachine {
    /**
     * 刷身份证
     */
    void blushIdCard(String number);

    /**
     * 刷银行卡
     */
    void blushBankCard(String number);
}
