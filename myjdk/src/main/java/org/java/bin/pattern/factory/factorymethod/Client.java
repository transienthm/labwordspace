package org.java.bin.pattern.factory.factorymethod;

/**
 * Created by wangbin on 2017/1/31.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();

        Product productA = factory.createProduct(ProductA.class);
        productA.operation();

        Product productB = factory.createProduct(ProductB.class);
        productB.operation();

        Product productC = SimpleFactory.createProduct(ProductA.class);
        productC.operation();

        Product productD = SimpleFactory.createProduct(ProductB.class);
        productD.operation();
    }
}
