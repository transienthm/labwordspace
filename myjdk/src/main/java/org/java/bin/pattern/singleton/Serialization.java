package org.java.bin.pattern.singleton;

import java.io.*;

/**
 * Created by wangbin on 2017/1/29.
 */
public class Serialization{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        SingletonDemo03 s1 = SingletonDemo03.getInstance();
        FileOutputStream fos = new FileOutputStream("/Users/wangbin/Documents/workspace/myjdk/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/wangbin/Documents/workspace/myjdk/a.txt"));
        SingletonDemo03 s2 = (SingletonDemo03) ois.readObject();

        System.out.println(s1 == s2);
    }
}
