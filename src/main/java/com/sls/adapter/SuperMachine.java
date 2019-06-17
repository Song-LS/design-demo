package com.sls.adapter;

import com.sls.adapter.MachineType;

/**
 * 高级机器
 * @author sls
 **/
public interface SuperMachine {

    /**
     * 刷卡
     */
    void blush(MachineType machineType, String number);
}
