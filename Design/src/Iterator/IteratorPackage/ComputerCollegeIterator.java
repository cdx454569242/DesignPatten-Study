package Iterator.IteratorPackage;

import java.util.Iterator;

import Iterator.Department;

/**
 * @author
 * @create 2020-09-23 14:46
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;
        return department;
    }
}
