package org.java.bin.pattern.proxy.staticProxy;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Created by wangbin on 2017/1/26.
 */
@AllArgsConstructor
public class ProxyStar implements Star {

    private Star realStar;

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney");
    }
}
