package Liskov.Improve;

/**
 * @author
 * @create 2020-09-18 19:20
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出 11-3
        System.out.println("1-8=" + b.func1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

//创建更加基础的基类
class Base{
    //把更加基础的方法和成员写到Base类
}

//A 类
class A extends Base{
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 类继承了 A
// 增加了一个新功能：完成两个数相加,然后和 9 求和
class B extends Base{
    private A a = new A();
    //如果B需要使用A类的方法 使用组合的关系
    public int func1(int a, int b) {
        return this.a.func1(a,b);
    }
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}