import Observer.Cliente;
import subject.Reloj;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutosIngresados, segundosIngreasados;

        System.out.println("Digite un de minutos que desee para recibir una notifiacion.");
        minutosIngresados = scanner.nextInt();

        System.out.println("Digite un numero de cada cuantos segundos deseea recibir una notificacion.");
        segundosIngreasados = scanner.nextInt();


        Reloj r = new Reloj();
        boolean verdadero = true;
        int cont = 0;
        Cliente cliente = new Cliente(minutosIngresados,segundosIngreasados,r);

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
                cliente.update();
            }
            if (cont == cliente.getNumIngresadoSegundos()){
                cliente.update();
                cont = 0;
            }
        }
    }
}
