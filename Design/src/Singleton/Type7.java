package Singleton;

/**
 * 懒汉式单例模式 静态内部类实现
 */
public class Type7 {
}

class Singleton7{
    private Singleton7(){}

    //写一个静态内部类,该类中有一个静态的属性
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE =  new Singleton7();
    }

    //提供一个静态的共有方法,直接返回静态内部类中的实例对象
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
