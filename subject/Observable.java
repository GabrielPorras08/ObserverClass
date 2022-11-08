package subject;

import Observer.Observer;

public interface Observable {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObserver();
}
