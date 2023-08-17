package repasob;

import java.util.Iterator;
import java.util.Scanner;

public class GuiaB {

    //Ejercicio 6
    static void numMayor(int num1, int num2) {
        System.out.println(Math.max(num1, num2));
    }

    //Ejercicio 7
    static void esParoImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    //Ejercicio 8
    static void esEureka(String frase) {
        boolean eureka = frase.equals("eureka");

        if (eureka) {
            System.out.println("Es Correcto");
        } else {
            System.out.println("Es Incorrecto");
        }
    }

    //Ejercicio 9
    static void length8(String frase) {
        int longitud = frase.length();

        if (longitud == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    //Ejercicio 10
    static void letraA(String frase) {
        if (frase.startsWith("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    //Ejercicio 11
    static void motor(int valor) {
        int tipoMotor;
        if (valor > 0 && valor < 5) {
            tipoMotor = valor;
            switch (tipoMotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor valido para tipo de bomba");
            }
        } else {
            System.out.println("El valor debe estar entre 1 y 4");
        }
    }

    //Ejercicio 12
//    static void validar() {
//        int nota;
//        System.out.println("Ingrese nota");
//        Scanner scanner = new Scanner(System.in);
//        nota = scanner.nextInt();
//        while (nota < 0 || nota > 10) {
//            System.out.println("Ingrese de nuevo una nota que este entre 0 y 10");
//            nota = scanner.nextInt();
//        }
//        System.out.println("Excelente");
//    }

    //Ejercicio 13
    static void sumaLimite(){
        int suma=0;
        int limite;
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor limite");
        limite=scanner.nextInt();
        while (suma < limite) { 
            System.out.println("Ingrese un valor para hacer la sumatoria");
            num=scanner.nextInt();
            suma=suma+num;
        }
        System.out.println("suma: "+suma);
    }
    
    //Ejercicio 14
    
    
}
