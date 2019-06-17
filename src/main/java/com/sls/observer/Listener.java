package com.sls.observer;

/**
 * @author sls
 * 抽象观察者
 **/
public interface Listener {

    String getName();

    /**
     * 通知更新方法
     * @param message 消息
     */
    void update(String message);
}
