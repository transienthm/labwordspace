package org.java.bin.pattern.decorator;

/**
 * Created by wangbin on 2017/1/26.
 */
public interface ICar {
    void move();
}

class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

class SuperCar implements ICar {
    @Override
    public void move() {

    }
}


