package DesignPattern11.SingletonMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:28
 */
public class HungrySingleton {
    private static HungrySingleton Instance = new HungrySingleton();
    private HungrySingleton(){}

    public HungrySingleton getInstance() {
        return Instance;
    }
}
