package org.java.bin.pattern.singleton;

import java.io.Serializable;

/**
 * Created by wangbin on 2017/1/25.
 */
public class SingletonDemo03 implements Serializable{
    private SingletonDemo03() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("小样！");
        }
    }

    private static class SingletonHolder {
        private static final SingletonDemo03 INSTANCE = new SingletonDemo03();
    }

    public static SingletonDemo03 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

}
