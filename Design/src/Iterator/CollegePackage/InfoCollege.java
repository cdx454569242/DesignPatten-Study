package Iterator.CollegePackage;

import Iterator.Department;
import Iterator.IteratorPackage.InfoColleageIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author
 * @create 2020-09-23 14:57
 */
public class InfoCollege implements College{

    List<Department> list;

    public InfoCollege() {
        list = new ArrayList<Department>();
        addDepartment("信息网络安全","信息");
        addDepartment("网站网络安全","网站");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        list.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(list);
    }
}
