package com.sls.observer;

/**
 * 观察者B
 * @author sls
 **/
public class ListenerB implements Listener {
    @Override
    public String getName() {
        return "观察者B";
    }

    @Override
    public void update(String message) {
        System.out.println("观察者B收到消息更新" + message);
    }
}
