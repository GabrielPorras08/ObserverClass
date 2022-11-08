package subject;

public interface Observable {
    void attach(Observable o);
    void detach(Observable o);
    void notifyObserver();
}
