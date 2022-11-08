package Observer;

import subject.Reloj;

public class Cliente implements Observer{

    private int numIngresadoMinutos;
    private int numIngresadoSegundos;

    public Cliente(int numIngresadoMinutos, int numIngresadoSegundos, Reloj reloj) {
        this.numIngresadoMinutos = numIngresadoMinutos;
        this.numIngresadoSegundos = numIngresadoSegundos;
    }

    @Override
    public void update() {

    }
}
