package ejercicio_14;

public class Ejercicio_14 {

    public static void main(String[] args) {
        
        Fecha fechaActual = new Fecha(21, 4, 2023);
        Fecha otraFecha = new Fecha(20, 4, 2000);
        
        System.out.println(otraFecha.calcularAños(fechaActual));
    }
}
