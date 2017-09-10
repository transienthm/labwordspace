package org.java.bin.pattern.singleton;

import org.java.bin.thread.SingletonDemo;

import java.io.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by wangbin on 2017/1/25.
 */
public class Client01 {
    public static void main(String[] args) {
        SingletonDemo01 s11 = SingletonDemo01.getInstance();
        SingletonDemo01 s12 = SingletonDemo01.getInstance();
        System.out.println(s11 == s12);
        System.out.println(s11);
        System.out.println(s12);
        SingletonDemo03 s30 = SingletonDemo03.getInstance();
        System.out.println("s30=" + s30);

        try {
/*            Class<SingletonDemo03> clazz = (Class<SingletonDemo03>) Class.forName("org.java.bin.pattern.singleton.SingletonDemo03");
            Constructor<SingletonDemo03> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            SingletonDemo03 s51 = c.newInstance();
            SingletonDemo03 s52 = c.newInstance();
            System.out.println(s51 == s52);
            System.out.println("s51=" + s51);
            System.out.println("s52=" + s52);*/

            FileOutputStream fos = new FileOutputStream("/Users/wangbin/Documents/workspace/myjdk/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s30);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/wangbin/Documents/workspace/myjdk/a.txt"));
            SingletonDemo03 s33 = (SingletonDemo03) ois.readObject();
//            SingletonDemo03 s34 = (SingletonDemo03) ois.readObject();
            System.out.println("s33=" + s33);

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } /*catch (IllegalAccessException iae) {
            iae.printStackTrace();
        } catch (InstantiationException ie) {
            ie.printStackTrace();
        } catch (NoSuchMethodException nsme) {
            nsme.printStackTrace();
        } catch (InvocationTargetException ite) {
            ite.printStackTrace();
        }*/ catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
