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
public class HabitacionSimple extends Habitacion {

    private String categoria;

    public HabitacionSimple(int numero, double precio, int capacidad, String categoria) {
        super(numero, precio, capacidad);
        this.categoria = categoria;
    }

    @Override
    public String mostrarInformacion() {
        return "TuClase{"
                + "numero=" + numero
                + ", precio=" + precio
                + ", capacidad=" + capacidad
                + ", reservada=" + reservada
                + ", categoria=" + categoria
                + '}';
    }

}
