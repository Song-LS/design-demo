package com.sls.observer;

/**
 * A观察者
 * @author sls
 **/
public class ListenerA implements Listener {
    @Override
    public String getName() {
        return "观察者A";
    }

    @Override
    public void update(String message) {
        System.out.println("观察者A收到消息更新" + message);
    }
}
