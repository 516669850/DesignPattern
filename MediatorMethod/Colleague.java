package DesignPattern11.MediatorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 22:59
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void getMessage(String message);
}
