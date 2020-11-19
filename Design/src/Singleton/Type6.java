package Singleton;

/**
 * 懒汉式单例模式 双重检查(推荐使用)
 */
public class Type6 {
}

class Singleton6{
    private static volatile  Singleton6 instance;
    private Singleton6(){}

    //提供一个静态的共有方法,加入双重检查代码 解决线程安全问题还解决了效率问题
    public static Singleton6 getInstance(){
        if(instance==null){
            synchronized (Singleton6.class){
                if(instance==null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
