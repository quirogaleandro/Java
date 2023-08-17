package ejercicio_13;

public class Ejercicio_13 {

    public static void main(String[] args) {
        // TODO code application logic here

        if (Calculo.esPrimo(84)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        System.out.println(Calculo.valorAbsoluto(-900));

        Calculo.calcularRaices(1, -3, -4);
    }
}
