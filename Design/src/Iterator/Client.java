package Iterator;

import Iterator.CollegePackage.College;
import Iterator.CollegePackage.ComputerCollege;
import Iterator.CollegePackage.InfoCollege;
import Iterator.CollegePackage.OutputImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @create 2020-09-23 15:12
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutputImpl output = new OutputImpl(colleges);
        output.prinCollege();
    }
}
