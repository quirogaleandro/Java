package guia_3_ejercicio1;

public class Perro {
    private String nombre;
    private String raza;
    private int Edad;
    private int Tamaño;

    public Perro(String nombre, String raza, int Edad, int Tamaño){
        this.nombre=nombre;
        this.raza=raza;
        this.Edad=Edad;
        this.Tamaño=Tamaño;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }
    
    
    
}
