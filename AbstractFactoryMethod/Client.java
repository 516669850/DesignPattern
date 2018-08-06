package DesignPattern11.AbstractFactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:18
 */
public class Client {
    public static void main(String[] args){
        IFactory factory = new Factory();
        IProductA productA = factory.createProductA();
        IProductB productB = factory.createProductB();
        productA.productAMethod();
        productB.productBMethod();
    }
}
