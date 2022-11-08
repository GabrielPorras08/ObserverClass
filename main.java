import Observer.Cliente;
import subject.Reloj;

public class main {
    public static void main(String[] args) {

        Reloj r = new Reloj();
        boolean verdadero = true;
        int cont = 0;
        Cliente cliente = new Cliente(1,7,r);
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
