package DesignPattern11.AbstractFactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:17
 */
public class Factory implements IFactory {
    public IProductA createProductA(){
        return new ProductA();
    }
    public IProductB createProductB(){
        return new ProductB();
    }
}
