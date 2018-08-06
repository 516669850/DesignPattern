package DesignPattern11.DecoratorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 21:55
 */
public class DecoratorImp extends Decorator{
    public DecoratorImp(Component component){
        super(component);
    }
    public void operation(){
        super.operation();
        addOperation();
    }
    //装饰的方法
    public void addOperation(){}
}
