package DesignPattern11.MediatorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 23:21
 */
public class ColleagueA extends Colleague{
    public ColleagueA(Mediator mediator){
        super(mediator);
    }
    public void sendMessage(String message){
        mediator.send(message,this);
    }
    public void getMessage(String message){
        System.out.println("ColleagueA get: " + message);
    }
}
