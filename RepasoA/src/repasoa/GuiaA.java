/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoa;

/**
 *
 * @author Usuario}
 */
public class GuiaA {
    
    //Ejercicio 1
    static void sumaEnteros(int num1, int num2){
        System.out.println("Suma: "+(num1+num2));
    }

    //Ejercicio 2
    static void pedirNombre(String nombre){
        String name = nombre;
        System.out.println("Nombre: "+ name);
    }    
    
    //Ejercicio 3
    static void pedirFrase(String frase){
        System.out.println("Mayuscula: "+ frase.toUpperCase());
        System.out.println("Minuscula: "+ frase.toLowerCase());
    }  
    
    //Ejercicio 4
    static void convertirFahrenheit(int centigrados){
        double fahrenheit= 32+(9*centigrados/5);
        System.out.println("Convertidos a fahrenheit: "+ fahrenheit);
    }
    
    //Ejercicio 5
    static void mostrarConversion(int num){
        int doble=num*2;
        int triple=num*3;
        double raiz=Math.sqrt(num);
        System.out.println("Doble: "+ doble);
        System.out.println("Triple: "+ triple);
        System.out.println("Raiz: "+ raiz);
    }
}
