package org.java.bin.pattern.factory.factorymethod;

/**
 * Created by wangbin on 2017/1/31.
 */
public abstract class AbstractFactory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
