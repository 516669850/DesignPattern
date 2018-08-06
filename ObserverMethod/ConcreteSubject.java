package DesignPattern11.ObserverMethod;

/**
 * @author TianYe
 * @create 2018-08-06 10:37
 */
public class ConcreteSubject extends Subject{
    private String state;

    public String getState(){
        return state;
    }

    public void change(String newState){
        this.state = newState;
        this.notifyObservers(newState);
    }
}
