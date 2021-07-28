package nuc.edu.memento;

/**
 * @author 薛东
 * @date 2021/7/28 10:06
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
