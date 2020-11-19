package Iterator.CollegePackage;

import java.util.Iterator;

import Iterator.Department;
import Iterator.IteratorPackage.ComputerCollegeIterator;


/**
 * @author
 * @create 2020-09-23 14:57
 */
public class ComputerCollege implements College{

    Department[] departments;
    int count = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java","j");
        addDepartment("php","p");
        addDepartment("c","c");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[count] = department;
        count+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
