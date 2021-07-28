package nuc.edu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/27 19:26
 */
public class InfoColleageIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList){
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1){
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
