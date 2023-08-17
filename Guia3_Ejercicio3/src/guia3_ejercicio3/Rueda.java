package guia3_ejercicio3;

public class Rueda {

    private String marca;
    private double presion;

    public Rueda(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }
    
    public void inflar() {
        this.presion = 28.0;
        System.out.println("Inflando, la presión actual de la rueda "+ this.marca + " es: " + this.presion);
    }

    public void desinflar() {
        this.presion -= 0.5;
        System.out.println("Desinflando, la presión actual de la rueda "+ this.marca + " es: " + this.presion);
    }

    public void pinchar(){
        this.presion=0;
    }
    
}
