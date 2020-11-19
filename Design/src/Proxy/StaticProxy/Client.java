package Proxy.StaticProxy;

/**
 * @author
 * @create 2020-09-22 11:09
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
