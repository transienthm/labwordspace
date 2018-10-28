package org.java.bin.pattern.bridge;

/**
 * Created by wangbin on 2017/1/26.
 * 未使用桥接模式
 */
public interface Computer {
    void sale();
}

class Desktop implements Computer {
    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer {
    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer {
    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class LenovoDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

