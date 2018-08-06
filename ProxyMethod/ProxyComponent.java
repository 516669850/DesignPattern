package DesignPattern11.ProxyMethod;

/**
 * @author TianYe
 * @create 2018-08-05 22:15
 * 代理类
 */
public class ProxyComponent implements Component {
    private RealComponent realComponent;

    public void method(){
        preMethod();
        if(realComponent == null){
            realComponent = new RealComponent();
        }
        realComponent.method();
        postMethod();
    }

    private void preMethod(){}

    private void postMethod(){}
}
