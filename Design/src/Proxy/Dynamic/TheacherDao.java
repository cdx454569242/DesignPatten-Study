package Proxy.Dynamic;

/**
 * @author
 * @create 2020-09-22 14:13
 */
public class TheacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
