/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaljava;

/**
 *
 * @author Usuario}
 */
public class HabitacionDoble extends Habitacion {

    private String vista;

    public HabitacionDoble(int numero, double precio, int capacidad, String vista) {
        super(numero, precio, capacidad);
        this.vista = vista;
    }

    @Override
    public String mostrarInformacion() {
        return "TuClase{"
                + "numero=" + numero
                + ", precio=" + precio
                + ", capacidad=" + capacidad
                + ", reservada=" + reservada
                + ", categoria=" + vista
                + '}';
    }

}
