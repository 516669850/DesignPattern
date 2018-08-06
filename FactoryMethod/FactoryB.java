package DesignPattern11.FactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-04 11:07
 */
public class FactoryB implements IFactory{
    public IProduct createProduct(){
        return new ProductB();
    }
}
