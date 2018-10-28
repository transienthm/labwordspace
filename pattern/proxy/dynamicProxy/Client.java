package org.java.bin.pattern.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by wangbin on 2017/1/26.
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler
        );

        proxy.sing();
    }
}
