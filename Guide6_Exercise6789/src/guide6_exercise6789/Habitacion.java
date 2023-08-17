/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide6_exercise6789;

/**
 *
 * @author Usuario}
 */
public abstract class Habitacion {
    private int numero;
    private double precio;
    private int capacidad;
    private boolean reservada = false;

    public Habitacion(int numero, double precio, int capacidad) {
        this.numero = numero;
        this.precio = precio;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public boolean isReservada(){
        return this.reservada;
    }
    
    public void setReservada(boolean reservada){
        this.reservada=reservada;
    }

    public String mostrarInformacion(){
        return "TuClase{" +
                "numero=" + numero +
                ", precio=" + precio +
                ", capacidad=" + capacidad +
                ", reservada=" + reservada +
                '}';
    }
    
}
