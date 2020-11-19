package Proxy.Cglib;

/**
 * @author
 * @create 2020-09-22 14:53
 */
public class TeacherDao {
    public void teach(){
        System.out.println("老师授课中 Cglib代理 不使用接口");
    }

    public String hello(String name){
        System.out.println("hello " + name);
        return name;
    }
}
