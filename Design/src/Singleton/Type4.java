package Singleton;

/**
 * 懒汉式单例模式 线程安全
 */
public class Type4 {
}

class Singleton4{
    private static Singleton4 instance;
    private Singleton4(){}

    //提供一个静态的共有方法,当需要用到时 才创建单例对象
    public static synchronized Singleton4 getInstance(){
        if(instance==null){
            instance = new Singleton4();
        }
        return instance;
    }
}
