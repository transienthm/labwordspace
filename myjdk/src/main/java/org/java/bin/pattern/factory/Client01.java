package org.java.bin.pattern.factory;

/**
 * Created by wangbin on 2017/1/25.
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = SimpleFactory.createAudi();
        Car c2 = SimpleFactory.createByd();

        c1.run();
        c2.run();
    }
}
