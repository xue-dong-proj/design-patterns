package nuc.edu.iterator;

import java.util.Iterator;

/**
 * @author 薛东
 * @date 2021/7/27 19:17
 */
public interface College {
    public String getName();

    public void addDepartment(String name, String description);

    public Iterator createIterator();
}
