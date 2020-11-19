package Singleton;

/**
 * 饿汉式单例 静态代码块实现
 */
public class Type2 {
}

class Singleton2{
    //1.私有化构造器
    private Singleton2(){ }
    //2.本部类中创建对象实例
    private static Singleton2 instance;

    //3.在静态代码块内创建对象实例
    static {
        instance = new Singleton2();
    }

    //4.提供一个公共静态方法,返回对象提供使用
    public static Singleton2 getInstance(){
        return instance;
    }
}
