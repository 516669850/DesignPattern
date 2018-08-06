package DesignPattern11.SingletonMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:35
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    private  StaticInnerClassSingleton(){}

    public StaticInnerClassSingleton getInstance(){
        return InnerClass.INSTANCE;
    }
}
