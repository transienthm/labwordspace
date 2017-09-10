package org.java.bin.pattern.bridge;

/**
 * Created by wangbin on 2017/1/26.
 */
public interface Brand {
    void sale();
}


class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}