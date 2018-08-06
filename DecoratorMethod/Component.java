package DesignPattern11.DecoratorMethod;
/**
 * 装饰者模式，动态的给一个对象添加一些额外的职责，比生成子类更加灵活
 * 装饰类也可以互相装饰
 *
 * Comperation是共同接口
 * */
public interface Component {
    void operation();
}
