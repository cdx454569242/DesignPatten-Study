package Visitor;

/**
 * @author
 * @create 2020-09-23 10:26
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男 认为 失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女 认为 失败");
    }
}
