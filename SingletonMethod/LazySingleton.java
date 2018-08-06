package DesignPattern11.SingletonMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:24
 */
public class LazySingleton {
    private static LazySingleton Instance;
    private LazySingleton(){}

    public LazySingleton getInstance() {
        if(Instance == null){
            Instance = new LazySingleton();
        }
        return Instance;
    }
}
