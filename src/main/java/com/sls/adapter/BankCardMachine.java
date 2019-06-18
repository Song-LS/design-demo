package com.sls.adapter;

/**
 * 银行卡刷卡器
 * @author sls
 **/
public class BankCardMachine implements CardMachine {
    @Override
    public void blushIdCard(String number) {

    }

    @Override
    public void blushBankCard(String number) {
        System.out.println("银行卡刷卡器执行刷卡，卡号：" + number);
    }
}
