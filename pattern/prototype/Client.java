package org.java.bin.pattern.prototype;

import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by wangbin on 2017/1/25.
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Sheep s1 = new Sheep("少利", new Date(12441314322324l));
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
