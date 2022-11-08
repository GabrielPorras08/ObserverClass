package subject;

import Observer.Observer;

import java.util.ArrayList;

public class Reloj implements Observable{
    private int seconds;
    private int minutes;
    private int hours;
    private ArrayList<Observer> clockObservers;

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

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean validarMultiplos7(){

        return this.minutes % 7 == 0;
    }

    @Override
    public void attach(Observer o) {
        clockObservers.add(o);
    }

    @Override
    public void detach(Observer o) {

    }

    @Override
    public void notifyObserver() {
        for (Observer o: clockObservers) {
            o.update();
        }
    }
}
