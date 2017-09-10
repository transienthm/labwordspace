package org.java.bin.pattern.adapter;

/**
 * Created by wangbin on 2017/1/26.
 * 适配器 相当于usb ps/2转换器
 * 类适配器方式
 */

public class Adapter extends Adaptee implements Target {



    @Override
    public void handleReq() {
        super.request();
    }
}
