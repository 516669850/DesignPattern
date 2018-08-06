package DesignPattern11.StaticFactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-04 10:51
 */
public class Client {
    public static void main(String[] args){
        Product productA = ProductFactory.createProduct("A");
        Product productB = ProductFactory.createProduct("B");
        productA.productMethod();
        productB.productMethod();
    }
}
