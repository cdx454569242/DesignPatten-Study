package InterfaceSegregation.Improve;

/**
 * 接口隔离改进
 * 很像单一原则 把原来具有五个方法的接口1分成多个接口 将这五个方法分配给多个接口 减少多个方法集中一个接口
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1{
    public void operation1();
}

interface Interface2{
    public void operation2();
    public void operation3();
}

interface Interface3{
    public void operation4();
    public void operation5();
}

class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

//A类通过接口Interface1使用B类中的 Interface1 但只会用到1,2,3方法
class A{
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface2 i){
        i.operation2();
    }

    public void depend3(Interface2 i){
        i.operation3();
    }
}

//C类通过接口Interface1使用D类中的 Interface1 但只会用到1,4,5方法
class C{
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend4(Interface3 i){
        i.operation4();
    }

    public void depend5(Interface3 i){
        i.operation5();
    }
}