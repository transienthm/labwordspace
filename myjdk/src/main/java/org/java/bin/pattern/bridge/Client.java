package org.java.bin.pattern.bridge;

/**
 * Created by wangbin on 2017/1/26.
 */
public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());

        c.sale();
    }
}
