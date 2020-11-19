package Proxy.Dynamic;



/**
 * @author
 * @create 2020-09-22 14:21
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TheacherDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello("abc");
    }
}
