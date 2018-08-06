package DesignPattern11.ProxyMethod;

/**
 * @author TianYe
 * @create 2018-08-05 22:14
 */
public class RealComponent implements Component{
    public void method(){
        System.out.println("具体方法");
    }
}
