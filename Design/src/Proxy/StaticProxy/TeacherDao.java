package Proxy.StaticProxy;

/**
 * @author
 * @create 2020-09-22 11:06
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}
