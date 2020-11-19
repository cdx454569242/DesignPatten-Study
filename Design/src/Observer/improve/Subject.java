package Observer.improve;

/**
 * @author
 * @create 2020-09-23 19:54
 */
public interface Subject {
    public void registerObserve(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
