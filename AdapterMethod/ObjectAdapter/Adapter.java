package DesignPattern11.AdapterMethod.ObjectAdapter;

/**
 * @author TianYe
 * @create 2018-08-05 20:58
 */
public class Adapter implements Target {
    //不是继承，而是委派，适配器模式是对象的
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request(){
        this.adaptee.adapteeMethod();
    }
}
