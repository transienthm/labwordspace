package org.java.bin.pattern.factory.factorymethod;

/**
 * Created by wangbin on 2017/1/31.
 */
public class ConcreteFactory extends AbstractFactory{

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product p = null;
        try {
            p = (T) c.newInstance();
        } catch (Exception e) {
            System.out.println("生产产品失败");
            e.printStackTrace();
        }
        return (T) p;
    }
}
