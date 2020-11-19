package Singleton;

/**
 * 懒汉式单例模式 枚举
 */
public class Type8 {
    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 =  Singleton8.INSTANCE;
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

enum Singleton8{
    INSTANCE;
}

