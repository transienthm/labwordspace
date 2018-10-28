package org.java.bin.pattern.factory;

/**
 * Created by wangbin on 2017/1/25.
 */
public class SimpleFactory {
    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
