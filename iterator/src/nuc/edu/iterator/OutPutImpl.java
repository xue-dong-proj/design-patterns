package nuc.edu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/27 19:29
 */
public class OutPutImpl {
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            printDepartment(college.createIterator()); //得到对应迭代器
        }
    }

    public void printDepartment(Iterator iterator) {
        while(iterator.hasNext()) {
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}
