package Inversion.Default;

/**
 * 依赖倒置原则说明
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}



class Email{
    public String getInfo(){
        return "电子邮件信息";
    }
}

//完成Person接受消息的功能
//方式1分析
//1.简单
//问题: 如果收到的对象是微信,短信等,要新增类去处理不同信息对象
//解决思路:引入一个抽象的接口IReceiver,表示接受信息,使Person类和接口发生依赖
//因为Email,微信等都属于信息,他们各自实现IReceiver接口,符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}