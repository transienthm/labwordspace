package org.java.bin.pattern.singleton;

/**
 * 懒汉式
 * Created by wangbin on 2017/1/25.
 */
public class SingletonDemo02 {
    private SingletonDemo02() {
    }

    private static SingletonDemo02 instance;

    public static SingletonDemo02 getInstance() {
        instance = new SingletonDemo02();
        return instance;
    }
}
