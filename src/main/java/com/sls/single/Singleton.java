package com.sls.single;

/**
 * @author sls
 **/
public enum Singleton implements MySingleton {
    /**
     * 实例
     */
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("执行方法。。。。");
        }
    }
}
