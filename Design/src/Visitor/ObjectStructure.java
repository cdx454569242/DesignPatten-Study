package Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author
 * @create 2020-09-23 10:35
 */
public class ObjectStructure {
    private List<Person> list = new LinkedList<>();

    public void add(Person p ){
        list.add(p);
    }

    public void remove(Person p){
        list.remove(p);
    }

    public void print(Action action){
        for(Person p : list){
            p.accept(action);
        }
    }

}
