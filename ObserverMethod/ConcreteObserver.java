package DesignPattern11.ObserverMethod;

/**
 * @author TianYe
 * @create 2018-08-06 10:40
 */
public class ConcreteObserver implements Observer{
    private String state;

    public void update(String newState){
        this.state = newState;
        System.out.println("状态为：" + newState);
    }
}
