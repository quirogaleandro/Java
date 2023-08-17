package ejercicio_5;


public class Pieza {
    private String nombre;
    private String movimiento;
    private String movimiento_al_comer;
    private int valor;
    private String color;
    
    public Pieza(String nombre, String movimiento, String movimiento_al_comer, int valor, String color){
        this.nombre=nombre;
        this.movimiento=movimiento;
        this.movimiento_al_comer=movimiento_al_comer;
        this.valor=valor;
        this.color=color;
    };
    public Pieza(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getMovimiento_al_comer() {
        return movimiento_al_comer;
    }

    public void setMovimiento_al_comer(String movimiento_al_comer) {
        this.movimiento_al_comer = movimiento_al_comer;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
   
}
