import subject.Reloj;

public class main {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        boolean verdadero = true;

        while (true){

            r.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            r.show();

        }
    }
}
