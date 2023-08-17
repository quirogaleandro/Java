package guia4_ejercicio3;

public class Rectangulo implements CalculoFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = this.base * this.altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

}
