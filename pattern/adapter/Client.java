package org.java.bin.pattern.adapter;

/**
 * Created by wangbin on 2017/1/26.
 * 客户端 相当于笔记本，只有USB接口
 */
public class Client {

    public void test1(Target target) {
        target.handleReq();

    }
    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();

        Target t = new Adapter();

        Target t2 = new Adapter2(a);
        c.test1(t);

        c.test1(t2);

    }
}
