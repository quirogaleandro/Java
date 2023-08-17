/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

/**
 *
 * @author Usuario}
 */
public class Circulo {
    private double PI=3.14;
    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return this.PI * Math.pow(this.radio,2 );
    }
    public double calcularPerimetro(){
        return 2 * (this.PI * this.radio); 
    }
}
