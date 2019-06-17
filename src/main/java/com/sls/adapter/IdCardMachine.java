package com.sls.adapter;

import com.sls.adapter.CardMachine;

/**
 * 身份证刷卡器
 * @author sls
 **/
public class IdCardMachine implements CardMachine {
    @Override
    public void blushIdCard(String number) {
        System.out.println("身份证刷卡器执行刷卡，卡号：" + number);
    }

    @Override
    public void blushBankCard(String number) {

    }
}
