package Singleton;

/**
 * 懒汉式单例模式 线程不安全
 */
public class Type3 {
}

class Singleton3{
    private static Singleton3 instance;
    private Singleton3(){}

    //提供一个静态的共有方法,当需要用到时 才创建单例对象
    public static Singleton3 getInstance(){
        if(instance==null){
            instance = new Singleton3();
        }
        return instance;
    }
}
