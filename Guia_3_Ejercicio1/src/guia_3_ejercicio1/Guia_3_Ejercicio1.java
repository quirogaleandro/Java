package guia_3_ejercicio1;

public class Guia_3_Ejercicio1 {

    public static void main(String[] args) {
        Persona persona1=new Persona("Leandro","Quiroga",22,"43551310");
        Perro perro1=new Perro("Agustina","Cocker",11,3);
        Perro perro2=new Perro("Quimey","Dogo",10,1);
        Perro perro3=new Perro("Rocko","Labrador",26,2);
        Perro perro4=new Perro("Ramiro","Labrador",2,2);
        
        persona1.adoptarPerro(perro1);
        persona1.adoptarPerro(perro2);
        persona1.adoptarPerro(perro3);
        persona1.adoptarPerro(perro4);
        
        System.out.println("El perro mas grande es: ");
        System.out.print(persona1.perroMasGrande().getNombre()+", ");
        System.out.print(persona1.perroMasGrande().getRaza()+", ");
        System.out.print(persona1.perroMasGrande().getEdad()+", ");
        System.out.println(persona1.perroMasGrande().getTamaño());
        System.out.println("Los perros de "+persona1.getNombre()+" son: ");
        persona1.mostrarTodos();
    }

}
