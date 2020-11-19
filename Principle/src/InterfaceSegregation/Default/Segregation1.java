package InterfaceSegregation.Default;

/**
 * 接口隔离问题说明版本
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
    }
}

interface Interface1{
    public void operation1();
    public void operation2();
    public void operation3();
    public void operation4();
    public void operation5();
}

class B implements Interface1{

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

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
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

    public void depend2(Interface1 i){
        i.operation2();
    }

    public void depend3(Interface1 i){
        i.operation3();
    }
}

//C类通过接口Interface1使用B类中的 Interface1 但只会用到1,4,5方法
class C{
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface1 i){
        i.operation4();
    }

    public void depend3(Interface1 i){
        i.operation5();
    }
}