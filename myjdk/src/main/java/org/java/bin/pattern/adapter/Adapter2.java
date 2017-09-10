package org.java.bin.pattern.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 适配器 对象适配器方式
 * Created by wangbin on 2017/1/26.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Adapter2 implements Target {
    private Adaptee adaptee;

    @Override
    public void handleReq() {
        System.out.println("****");
        System.out.println("适配器2");
        adaptee.request();
    }
}
