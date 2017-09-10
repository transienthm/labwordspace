package org.java.bin.pattern.singleton;

/**
 * 双锁机制
 * Created by wangbin on 2017/1/25.
 */
public class SingletonDemo05 {
    private SingletonDemo05() {
    }

    private static SingletonDemo05 instance;

    public static SingletonDemo05 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo05.class) {
                if (instance == null) {
                    instance = new SingletonDemo05();
                    return instance;
                }
            }
        }
        return instance;
    }
}
