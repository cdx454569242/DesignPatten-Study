package Visitor;

/**
 * @author
 * @create 2020-09-23 10:24
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
