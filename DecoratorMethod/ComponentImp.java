package DesignPattern11.DecoratorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 21:50
 * 被装饰类
 */
public class ComponentImp implements Component {
    public void operation(){
        System.out.println("被装饰类的具体方法");
    }
}
