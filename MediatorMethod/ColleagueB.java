package DesignPattern11.MediatorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 23:28
 */
public class ColleagueB extends Colleague{
    public ColleagueB(Mediator mediator){
        super(mediator);
    }
    public void sendMessage(String message){
        mediator.send(message, this);
    }
    public void getMessage(String message){
        System.out.println("ColleagueB get: " + message);
    }
}
