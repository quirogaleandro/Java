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
public class Suite extends Habitacion implements Oferta {

    private String servicioAdicional;

    public Suite(int numero, double precio, int capacidad, String servicioAdicional) {
        super(numero, precio, capacidad);
        this.servicioAdicional = servicioAdicional;
    }

    @Override
    public String mostrarInformacion() {
        return "TuClase{"
                + "numero=" + numero
                + ", precio=" + precio
                + ", capacidad=" + capacidad
                + ", reservada=" + reservada
                + ", categoria=" + servicioAdicional
                + '}';
    }

    @Override
    public void calcularDescuento(int porcentaje) {
        double descuento = this.precio * (porcentaje / 100.0);
        this.precio -= descuento;
    }

}
