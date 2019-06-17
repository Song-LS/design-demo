package com.sls.observer;

import com.sls.observer.AbstractSubject;

/**
 * 具体观察者
 * @author sls
 **/
class AbstractSubjectA extends AbstractSubject {
    void click() {
        System.out.println("按钮被点击");
        notifyObserver();
    }
}
