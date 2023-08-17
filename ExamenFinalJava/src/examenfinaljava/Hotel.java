package examenfinaljava;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel {

    private ArrayList<Habitacion> disponibles = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        disponibles.add(habitacion);
//        System.out.println("Habitacion agregada: " + habitacion);
    }

    public void mostrarDisponibles() {
        for (Habitacion disponible : disponibles) {
            if(disponible.isReservada() == false){
                System.out.println(disponible);
            }
        }
    } //muestra informacion de todas las habitaciones con un bucle for each

    //Este metodo ordena la coleccion disponibles en base al numero de la habitacion de forma ascendente.
    public void ordenarPorNumero() {
        Collections.sort(disponibles, Comparators.sortByLastName);
    }

}
