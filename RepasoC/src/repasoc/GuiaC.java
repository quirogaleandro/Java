package repasoc;

import java.util.Scanner;

public class GuiaC {

    static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int opcion_elegida;
        int num_corte = 0;
        char confirmacion;

        while (num_corte == 0) {
            System.out.println("Ingrese dos numeros");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println("Seleccione la operación que desee");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");

            opcion_elegida = scanner.nextInt();

            switch (opcion_elegida) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir(S/N)?");
                    confirmacion = scanner.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo..");
                        num_corte = 1;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    static void sumaNumLeidos() {
        Scanner scanner = new Scanner(System.in);
        boolean condicion_corte = false;
        int suma = 0;

        while (!condicion_corte) {
            System.out.println("Ingrese un número");
            int num = scanner.nextInt();
            if (num != 0) {
                suma = suma + num;
            } else {
                condicion_corte = true;
                break;
            }
        }
        System.out.println("Suma:" + suma);
    }

    static void dispositivoRS232() {
        Scanner scanner = new Scanner(System.in);
        boolean condicion_corte = false;
        int cadenas_correctas = 0;
        int cadenas_incorrectas = 0;

        while (!condicion_corte) {
            System.out.println("Ingrese una palabra");
            String cadena = scanner.nextLine();
            if (cadena.equals("&&&&&")) {
                condicion_corte = true;
            } else {
                int length = cadena.length();
                if (length == 5 && cadena.startsWith("X") && cadena.endsWith("O")) {
                    System.out.println("Corecta");
                    cadenas_correctas += 1;
                } else {
                    System.out.println("Incorrecta");
                    cadenas_incorrectas += 1;
                }
            }
        }
        System.out.println("cadenas correctas: " + cadenas_correctas);
        System.out.println("cadenas incorrectas: " + cadenas_incorrectas);
    }

    //Ejercicio 17
    static void dibujarCuadrado(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    static void imprimeAsteriscos() {
        int num;
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 4 números comprendidos entre 1 y 20");
        while (j < 4) {
            num = scanner.nextInt();
            if (num > 0 && num < 20) {
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println("");
                j = j + 1;
            }else{
                System.out.println("Número no valido");
            }
        }
    }

}
