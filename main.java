import Observer.Cliente;
import subject.Reloj;
import java.util.Scanner;
public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Reloj r = new Reloj();
        boolean verdadero = true;
        int cont = 0;
        Cliente cliente = new Cliente(1,4,r);
        r.attach(cliente);
        while (true){
            r.tick();
            cont++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            r.show();
            if(cliente.validarMinutos() || cliente.getReloj().validarMultiplos7()){
                cliente.getReloj().notifyObserver();
            }
            if (cont == cliente.getNumIngresadoSegundos()){
                cliente.getReloj().notifyObserver();
                cont = 0;
            }

        }
    }
}
