package org.java.bin.pattern.factory.factorymethod;

/**
 * Created by wangbin on 2017/1/31.
 */
public class SimpleFactory {
    public static <T extends Product> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
            product = tClass.newInstance();
        } catch (Exception e) {
            System.out.println("产品创建失败");
            e.printStackTrace();
        }
        return (T) product;
    }
}
