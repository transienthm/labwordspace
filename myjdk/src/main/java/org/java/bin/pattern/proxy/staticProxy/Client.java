package org.java.bin.pattern.proxy.staticProxy;

/**
 * Created by wangbin on 2017/1/26.
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
