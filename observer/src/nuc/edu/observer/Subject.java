package nuc.edu.observer;

/**
 * @author 薛东
 * @date 2021/7/27 22:08
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
