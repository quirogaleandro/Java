package guia4_ejercicio3;

public class Circulo implements CalculoFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = PI * Math.pow(2, radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = PI * (radio * 2);
        return perimetro;
    }
}
