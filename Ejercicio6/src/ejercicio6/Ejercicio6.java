/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import ejercicio6.Numero;
/**
 *
 * @author Usuario}
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Numero num1=new Numero(3);
        
        if(num1.esPar()){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
        
        if(num1.esPositivo()){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }
        
        if(num1.esMultiploDe(21)){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
        
    }
    
}
