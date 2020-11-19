package Singleton;

/**
 * 饿汉式单例 静态变量实现
 */
public class Type1 {
}

class Singleton{
    //1.私有化构造器
    private Singleton(){}
    //2.本部类中创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公共静态方法,返回对象提供使用
    public static Singleton getInstance(){
        return instance;
    }
}
