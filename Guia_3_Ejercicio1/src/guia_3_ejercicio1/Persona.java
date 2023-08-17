package guia_3_ejercicio1;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro1 = null;
    private Perro perro2 = null;
    private Perro perro3 = null;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro) {
        if (this.perro1 == null) {
            this.perro1 = perro;
        } else {
            if (this.perro2 == null) {
                this.perro2 = perro;
            } else {
                if (this.perro3 == null) {
                    this.perro3 = perro;
                } else {
                    System.out.println("No hay mas lugar para: "+perro.getNombre());
                }
            }
        }

    }

    public Perro perroMasGrande() {
        int edad_perro1 = perro1.getEdad();
        int edad_perro2 = perro2.getEdad();
        int edad_perro3 = perro3.getEdad();

        if (edad_perro1 > edad_perro2 && edad_perro1 > edad_perro3) {
            return this.perro1;
        }
        if (edad_perro2 > edad_perro1 && edad_perro2 > edad_perro3) {
            return this.perro2;
        }
        return this.perro3;
    }

    public void mostrarTodos() {
        System.out.println(this.perro1.getNombre());
        System.out.println(this.perro2.getNombre());
        System.out.println(this.perro3.getNombre());
    }

}
