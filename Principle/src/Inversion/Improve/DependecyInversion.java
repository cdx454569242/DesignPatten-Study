package Inversion.Improve;

/**
 * 依赖倒置原则问题改进版本
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

interface IReceiver{
    public String getInfo();
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信接受消息";
    }
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息";
    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}