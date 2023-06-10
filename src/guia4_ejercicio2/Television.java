package guia4_ejercicio2;

public class Television extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador_TDT;

    public Television(double resolucion, boolean sintonizador_TDT, String color, char consumo_energetico, double peso) {
        super(color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Television() {
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            double porcentaje = this.precio * 0.3;
            this.precio = this.precio+ porcentaje;
        }
        if (this.sintonizador_TDT) {
            this.precio = this.precio + 500;
        }
        System.out.println("Precio Final " + this.precio);
    }

}
