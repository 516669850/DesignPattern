package DesignPattern11.FacadeMethod;

/**
 * @author TianYe
 * @create 2018-08-05 22:03
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public Facade(){
        serviceA = new ServiceAImp();
        serviceB = new ServiceBImp();
    }

    public void method(){
        serviceA.methodA();
        serviceB.methodB();
    }
}
