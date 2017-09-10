package org.java.bin.pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangbin on 2017/1/26.
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(realStar, args);
        return null;
    }
}
