package DesignPattern11.AdapterMethod.ClassAdapter;

/**
 * @author TianYe
 * @create 2018-08-05 20:53
 */
public class Adapter extends Adaptee implements Target {
    //Adaptee没有Request方法，适配器只是对adapteeMethod方法进行了封装
    public void Request(){
        this.adapteeMethod();
    }
}
