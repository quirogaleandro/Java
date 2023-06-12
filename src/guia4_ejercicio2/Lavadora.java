package guia4_ejercicio2;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, String color, char consumo_energetico, double peso) {
        super(color, consumo_energetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void precioFinal() {
        super.precioFinal();

        if (this.carga > 30) {
            this.precio = this.precio + 500;
        }
        System.out.println("Precio Final "+this.precio);
    }

}
