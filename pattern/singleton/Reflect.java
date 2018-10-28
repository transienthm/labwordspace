package org.java.bin.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by wangbin on 2017/1/29.
 */
public class Reflect{
    public static void main(String[] args) throws Exception{
        Class<SingletonDemo01> clazz = (Class<SingletonDemo01>)Class.forName("org.java.bin.pattern.singleton.SingletonDemo03");
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo03 s1 = SingletonDemo03.getInstance();
        SingletonDemo03 s2 = (SingletonDemo03) c.newInstance();
        System.out.println(s1 == s2);
    }
}
