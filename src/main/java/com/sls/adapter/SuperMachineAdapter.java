package com.sls.adapter;

import com.sls.adapter.BankCardMachine;
import com.sls.adapter.CardMachine;
import com.sls.adapter.IdCardMachine;
import com.sls.adapter.MachineType;

/**
 * @author sls
 **/
public class SuperMachineAdapter implements SuperMachine {
    @Override
    public void blush(MachineType machineType, String number) {
        switch (machineType) {
            case ID_CARD:
                CardMachine cardMachine = new IdCardMachine();
                cardMachine.blushBankCard(number);
                break;
            case BANK_CARD:
                CardMachine cardMachine2 = new BankCardMachine();
                cardMachine2.blushBankCard(number);
                break;
             default:
                 throw new NullPointerException("没有找到合适机器");
        }
    }
}
