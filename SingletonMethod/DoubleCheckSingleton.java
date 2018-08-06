package DesignPattern11.SingletonMethod;

/**
 * @author TianYe
 * @create 2018-08-05 20:30
 */
public class DoubleCheckSingleton {
    //声明成volatile，因为下面的Instance = new DoubleCheckSingleton()
    //并非原子操作，volatile可以阻止指令重排
    private static volatile DoubleCheckSingleton Instance;
    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if(Instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(Instance == null){
                    Instance = new DoubleCheckSingleton();
                }
            }
        }
        return  Instance;
    }
}
