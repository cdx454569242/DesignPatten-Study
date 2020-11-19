package Iterator.IteratorPackage;

import java.util.Iterator;
import java.util.List;

import Iterator.Department;

/**
 * @author
 * @create 2020-09-23 14:52
 */
public class InfoColleageIterator implements Iterator {

    List<Department> list;
    int index = -1;

    public InfoColleageIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index>=list.size()-1){
            return false;
        }else{
            index+=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return list.get(index);
    }
}
