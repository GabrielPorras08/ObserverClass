package subject;

import Observer.Observer;

import java.util.ArrayList;

public class Reloj implements Observable{
    private int seconds;
    private int minutes;
    private int hours;
    private ArrayList<Observer> clockSubscribers;

    public void tick() {
        seconds += 1;
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
    }
    public void show(){
        System.out.println(hours + ":" + minutes + ":" + seconds );
        System.out.println();
    }

    @Override
    public void attach(Observer o) {
        clockSubscribers.add(o);
    }

    @Override
    public void detach(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }
}
