package ejercicio_15;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Pensador pensador1 = new Pensador(23);

        pensador1.invertir();
        System.out.println(pensador1.parAntes());
        System.out.println(pensador1.parPosterior());
        System.out.println(pensador1.primerDigito());
        System.out.println(pensador1.ultimoDigito());
    }
}
