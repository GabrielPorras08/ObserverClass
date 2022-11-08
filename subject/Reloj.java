package subject;

public class Reloj {
    private int seconds;
    private int minutes;
    private int hours;

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
}
