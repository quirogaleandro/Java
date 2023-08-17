package repasoa;

import java.util.Scanner;

public class RepasoA {

    public static void main(String[] args) {
       Scanner Leer=new Scanner(System.in);
       //Ejercicio 1
       int num1, num2;
       System.out.println("Ingrese el primer número");
       num1=Leer.nextInt();
       System.out.println("Ingrese el segundo número");
       num2=Leer.nextInt();
       GuiaA.sumaEnteros(num1, num2);
       
       //Ejercicio 2
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre=Leer.nextLine();
        GuiaA.pedirNombre(nombre);

        //Ejercicio 3
        String frase;
        System.out.println("Ingrese su frase");
        frase=Leer.nextLine();
        GuiaA.pedirFrase(frase);
        
        //Ejercicio 4
        int centigrado;
        System.out.println("Ingrese grados centigrados");
        centigrado=Leer.nextInt();
        GuiaA.convertirFahrenheit(centigrado);
        
        //Ejercicio 5
        int num;
        System.out.println("Ingrese un número");
        num=Leer.nextInt();
        GuiaA.mostrarConversion(num);
    }
    
}
