package nuc.edu.iterator;

import java.util.Iterator;

/**
 * @author 薛东
 * @date 2021/7/27 19:24
 */
public class ComputerCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
