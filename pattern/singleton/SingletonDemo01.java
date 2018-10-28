package org.java.bin.pattern.singleton;

/**
 * 饿汉式单例
 * Created by wangbin on 2017/1/24.
 */
public class SingletonDemo01 {
    private SingletonDemo01(){

    }

    private static SingletonDemo01 instance = new SingletonDemo01();

    public static SingletonDemo01 getInstance() {
        return instance;
    }

}
