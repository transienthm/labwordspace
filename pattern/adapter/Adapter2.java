package org.java.bin.pattern.adapter;


/**
 * 适配器 对象适配器方式
 * Created by wangbin on 2017/1/26.
 */

public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        System.out.println("****");
        System.out.println("适配器2");
        adaptee.request();
    }
}
