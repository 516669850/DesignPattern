package DesignPattern11.FactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:01
 */
public class Client {
    public static void main(String[] args){
        IProduct productA = new FactoryA().createProduct();
        IProduct productB = new FactoryB().createProduct();
        productA.productMethod();
        productB.productMethod();
    }
}
