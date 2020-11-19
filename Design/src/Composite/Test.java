package Composite;

/**
 * @author
 * @create 2020-09-21 19:57
 */
public class Test {
    public static void main(String[] args) {
        OrganizationComponent university = new University("A大学","A区的大学");

        OrganizationComponent college1 = new College("计算机学院", "计算机");
        OrganizationComponent college2 = new College("土木学院", "土木");

        college1.add(new Department("软件工程","软件"));
        college1.add(new Department("网络工程","网络"));
        college1.add(new Department("计算机科学与技术","计算机"));

        college2.add(new Department("设计建筑","设计"));
        college2.add(new Department("测量建筑","测量"));
        college2.add(new Department("材料建筑","材料"));

        university.add(college1);
        university.add(college2);

//        university.print();

        college1.print();

    }
}
