package Iterator.CollegePackage;

import Iterator.Department;
import java.util.Iterator;
import java.util.List;

/**
 * @author
 * @create 2020-09-23 15:06
 */
public class OutputImpl {
    List<College> list;

    public OutputImpl(List<College> list) {
        this.list = list;
    }

    public void prinCollege(){
        Iterator<College> iterator = list.iterator();
        while(iterator.hasNext()){
            College next = iterator.next();
            System.out.println(" ========= " + next.getName() + " ========= " );
            printDepartment(next.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
}
