package nuc.edu.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/27 12:36
 */
public class ObjectStructers {
    private List<Person> people = new ArrayList<>();

    public void attach(Person person){
        people.add(person);
    }

    public void detach(Person person){
        people.remove(person);
    }

    public void display(Action action){
        for (Person person : people) {
            person.accpet(action);
        }
    }
}
