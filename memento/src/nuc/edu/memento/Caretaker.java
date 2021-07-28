package nuc.edu.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/28 10:07
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get (int index){
        return mementoList.get(index);
    }
}
