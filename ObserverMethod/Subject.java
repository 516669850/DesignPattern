package DesignPattern11.ObserverMethod;



import java.util.HashSet;
import java.util.Set;

/**
 * @author TianYe
 * @create 2018-08-06 10:31
 */
public abstract class Subject {
    private Set<Observer> set = new HashSet<>();

    public boolean attach(Observer observer){
        return set.add(observer);
    }

    public boolean detach(Observer observer){
        return set.remove(observer);
    }

    public void notifyObservers(String newState){
        for(Observer observer : set){
            observer.update(newState);
        }
    }
}
