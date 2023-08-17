package guia_3_ejercicio2;

import java.time.LocalDate;

public class Guia_3_Ejercicio2 {
    public static void main(String[] args) {
        Kiosco kiosco1=new Kiosco("La Ribera","Store","20-321233-2");
        Empleado empleado1=new Empleado("Leandro","Quiroga",LocalDate.of(2001, 5, 15),"43551310");
        Empleado empleado2=new Empleado("Salamandra","Quis",LocalDate.of(2000, 3, 1),"11431310");
        Empleado empleado3=new Empleado("Maria","sosa",LocalDate.of(2990, 1, 10),"23551210");
        
        kiosco1.incorporarEmpleados(empleado1);
        kiosco1.incorporarEmpleados(empleado2);
        kiosco1.incorporarEmpleados(empleado3);
        
        System.out.println("El empleado mas antiguo es: ");
        System.out.println(kiosco1.empleadoMasAntiguo().getNombre()); 
        System.out.println("");
        System.out.println("Fecha de ingreso de todos los empleados: ");
        kiosco1.mostrarEmpleados();
    }
    
}
