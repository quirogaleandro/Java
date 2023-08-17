package ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Jugador jugador1=new Jugador();
        jugador1.setNombre("Juan");
        jugador1.setPuntaje(140);
        jugador1.setNacionalidad("Argentino");
        jugador1.setEdad(29);
        
        System.out.println("Edad: "+jugador1.getEdad());
        System.out.println("Nombre: "+jugador1.getNombre());
        System.out.println("Puntaje: "+jugador1.getPuntaje());
        System.out.println("Nacionalidad: "+jugador1.getNacionalidad());
    }
    
}
