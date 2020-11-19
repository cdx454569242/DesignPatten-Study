package Iterator.CollegePackage;

import java.util.Iterator;

/**
 * @author
 * @create 2020-09-23 14:55
 */
public interface College {
    public String getName();
    public void addDepartment(String name,String desc);
    public Iterator createIterator();

}
