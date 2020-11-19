package Visitor;

/**
 * @author
 * @create 2020-09-23 10:37
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man());
        objectStructure.add(new Woman());
        objectStructure.add(new Man());

        Success success = new Success();
        objectStructure.print(success);

        Fail fail = new Fail();
        objectStructure.print(fail);
    }
}
