/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;
import ejercicio_7.Cuadrilatero;
/**
 *
 * @author Usuario}
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrilatero figura1=new Cuadrilatero(70,70);
        
        System.out.println(figura1.calcularArea());
        
        System.out.println(figura1.calcularPerimetro());
        
        if(figura1.esUnCuadrado()){
            System.out.println("Es cuadrado");
        }else{
            System.out.println("No es cuadraro");
        }
        
    }  
}
