package DesignPattern11.DecoratorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 21:51
 * 抽象装饰类
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void operation(){
        component.operation();
    }
}
