package Observer;

import subject.Reloj;

public class Cliente implements Observer {

    private int numIngresadoMinutos;
    private int numIngresadoSegundos;
    private Reloj reloj;

    public Cliente(int numIngresadoMinutos, int numIngresadoSegundos, Reloj reloj) {
        this.numIngresadoMinutos = numIngresadoMinutos;
        this.numIngresadoSegundos = numIngresadoSegundos;
        this.reloj = reloj;
    }

    public int getNumIngresadoMinutos() {
        return numIngresadoMinutos;
    }

    public void setNumIngresadoMinutos(int numIngresadoMinutos) {
        this.numIngresadoMinutos = numIngresadoMinutos;
    }

    public int getNumIngresadoSegundos() {
        return numIngresadoSegundos;
    }

    public void setNumIngresadoSegundos(int numIngresadoSegundos) {
        this.numIngresadoSegundos = numIngresadoSegundos;
    }

    @Override
    public void update() {
        System.out.println("Nueva notificacion del reloj");
        System.out.println();
    }
    public Reloj getReloj(){
        return this.reloj;
    }

    public boolean validarMinutos() {

        while (reloj.getMinutes() > 0) {

            if (reloj.getMinutes() % 10 == numIngresadoMinutos) {
                return true;
            }
        }

        return false;
    }
    public boolean validarSegundosIngresados(){
        int cont = 0;
        cont++;
        return cont == this.numIngresadoSegundos;
    }
}
