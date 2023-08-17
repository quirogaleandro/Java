package ejercicio_2.Computadora;


public class Computadora {
    private int CPU;
    private int memoria;
    private int almacenamiento;
    private String marca;
    private double precio;
    
    public Computadora (int CPU, int memoria, int almacenamiento, String marca, double precio){
        this.CPU=CPU;
        this.memoria=memoria;
        this.almacenamiento=almacenamiento;
        this.marca=marca;
        this.precio=precio;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
