package com.sls.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sls
 * 抽象被观察者
 **/
abstract class AbstractSubject {

    /**
     * 观察者对象的集合
     */
    private List<Listener> listenerList = new ArrayList<>();

    /**
     * 添加观察者
     * @param listener 观察者
     */
    void add(Listener listener) {
        listenerList.add(listener);
    }

    /**
     * 通知所有观察者
     */
    void notifyObserver() {
        for (Listener listener : listenerList) {
            listener.update("通知所有观察者，按钮被点击。。。。");
        }
    }

}
