package guia4_ejercicio3;

public class Guia4_Ejercicio3 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        Rectangulo rectangulo1 = new Rectangulo(10, 20);

        System.out.println("area: " + circulo1.calcularArea());
        System.out.println("perimetro " + circulo1.calcularPerimetro());

        System.out.println("area rectangulo: " + rectangulo1.calcularArea());
        System.out.println("perimetro rectangulo: " + rectangulo1.calcularPerimetro());
    }

}
