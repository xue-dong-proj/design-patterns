package nuc.edu.iterator;

import java.util.Iterator;

/**
 * @author 薛东
 * @date 2021/7/27 19:20
 */
public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("Java","Java");
        addDepartment("PHP","PHP");
        addDepartment("大数据","大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name,description);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
