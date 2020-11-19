package Composite;

/**
 * @author
 * @create 2020-09-21 19:55
 */
public class Department extends OrganizationComponent{
    protected Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("当前系为:" + getName());
    }
}
