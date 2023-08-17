package guia_3_ejercicio2;
import java.time.LocalDate;

public class Kiosco {

    private String direccion;
    private String nombre;
    private String cuit;
    private Empleado empleado1 = null;
    private Empleado empleado2 = null;
    private Empleado empleado3 = null;

    public Kiosco(String direccion, String nombre, String cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void incorporarEmpleados(Empleado empleado) {
        if (empleado1 == null) {
            empleado1 = empleado;
        } else {
            if (empleado2 == null) {
                empleado2 = empleado;
            } else {
                if (empleado3 == null) {
                    empleado3 = empleado;
                } else {
                    System.out.println("Solo se permite incorporar hasta un máximno de 3 empleados");
                }
            }
        }
    }
    public Empleado empleadoMasAntiguo(){
        LocalDate antiguedad_empleado1=this.empleado1.getFecha_de_ingreso();
        LocalDate antiguedad_empleado2=this.empleado2.getFecha_de_ingreso();
        LocalDate antiguedad_empleado3=this.empleado3.getFecha_de_ingreso();
        
        if(antiguedad_empleado1.isBefore(antiguedad_empleado2) && antiguedad_empleado1.isBefore(antiguedad_empleado3)){
            return this.empleado1;
        }
        if(antiguedad_empleado2.isBefore(antiguedad_empleado3)){
            return this.empleado2;
        }
        return this.empleado3;
    }
    
    public void mostrarEmpleados(){
        System.out.println(this.empleado1.getNombre()+": "+this.empleado1.getFecha_de_ingreso());
        System.out.println(this.empleado2.getNombre()+": "+this.empleado2.getFecha_de_ingreso());
        System.out.println(this.empleado3.getNombre()+": "+this.empleado3.getFecha_de_ingreso());
    }
    
}
