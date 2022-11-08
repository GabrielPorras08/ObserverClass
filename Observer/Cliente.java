package Observer;

import subject.Reloj;

public class Cliente implements Observer{

    private int numIngresadoMinutos;
    private int numIngresadoSegundos;
    private Reloj reloj;

    public Cliente(int numIngresadoMinutos, int numIngresadoSegundos, Reloj reloj) {
        this.numIngresadoMinutos = numIngresadoMinutos;
        this.numIngresadoSegundos = numIngresadoSegundos;
        this.reloj = reloj;
    }

    @Override
    public void update() {
        System.out.println("Nueva notificacion del reloj");
    }
}
