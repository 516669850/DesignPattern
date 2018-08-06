package DesignPattern11.MediatorMethod;

/**
 * @author TianYe
 * @create 2018-08-05 23:09
 */
public class MediatorImp implements Mediator {
    private Colleague colleagueA;
    private Colleague colleagueB;

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void send(String message, Colleague colleague){
        if(colleague == colleagueA){
            colleagueB.getMessage(message);
        }else if(colleague == colleagueB){
            colleagueA.getMessage(message);
        }else{
            System.out.println("Error colleague");
        }
    }
}
