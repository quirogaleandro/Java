package guia_3_ejercicio2;
import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fecha_de_ingreso;
    private String dni;
    
    public Empleado(String nombre, String apellido, LocalDate fecha_de_ingreso, String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fecha_de_ingreso=fecha_de_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_de_ingreso() {
        return fecha_de_ingreso;
    }

    public void setFecha_de_ingreso(LocalDate fecha_de_ingreso) {
        this.fecha_de_ingreso = fecha_de_ingreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
