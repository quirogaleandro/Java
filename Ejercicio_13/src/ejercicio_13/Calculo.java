package ejercicio_13;

public class Calculo {

    public static boolean esPrimo(int num) {

        //Ya conocemos que el 0 y el 1 no son primos.
        if (num == 0 || num == 1) {
            return false;
        }

        //Iteracion entre los posibles numeros divisores de num que el resto de 0
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int valorAbsoluto(int num) {
        return Math.abs(num);
    }

    static void calcularRaices(double a, double b, double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos raíces: " + raiz1 + " y " + raiz2);
        }
    }
}
//Un numero primo es cuando un numero solo es divisible por uno y por si mismo.
//8) En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
// esPrimo(): Este método recibe un número entero y retorna true si el número recibido es
//primo, caso contrario retornará false.
// valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
// calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
//grado y mostrará por consola sus raíces y si no las tiene también lo informará.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//
//Utilizando los métodos estáticos de la clase Calculo:
//a) Informar por consola si un número escogido por usted es primo o no.
//b) Mostrar por consola el valor absoluto del valor -90;
//c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
