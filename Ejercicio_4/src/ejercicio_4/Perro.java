/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

public class Perro {
    private String nombre;
    private String raza;
    private double peso;
    private int edad;
    
    public Perro(String nombre, String raza, double peso, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.raza=raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad+" años");
        System.out.println("Peso: "+this.peso+"Kg");
        System.out.println("Raza: "+this.raza);
    }
    
}
