package Visitor;

/**
 * @author
 * @create 2020-09-23 10:24
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
