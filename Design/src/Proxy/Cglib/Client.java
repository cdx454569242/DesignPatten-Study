package Proxy.Cglib;

/**
 * @author
 * @create 2020-09-22 15:03
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao target = (TeacherDao)new ProxyFactory(teacherDao).getProyInstance();
        target.teach();

        System.out.println();

        String abc = target.hello("abc");
        System.out.println(abc);
    }
}
