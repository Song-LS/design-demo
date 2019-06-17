package com.sls.adapter;

/**
 * 高级机器提供给外部的刷卡口
 * @author sls
 **/
public class SuperMachineOut implements SuperMachine {
    @Override
    public void blush(MachineType machineType, String number) {
        SuperMachineAdapter machineAdapter = new SuperMachineAdapter();
        machineAdapter.blush(machineType, number);
    }
}
