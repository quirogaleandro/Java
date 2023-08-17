package examenfinaljava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamenFinalJava {

    public static Habitacion pedirDatos(String tipo) throws InputMismatchException,Exception{ //propagar execpciones
        Habitacion habitacion = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número: ");
            int numero = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese precio: ");
            double precio = leer.nextDouble();
            leer.nextLine();
            System.out.println("Ingrese capacidad: ");
            int capacidad = leer.nextInt();
            leer.nextLine();
            switch (tipo) {
                case "Simple":
                    System.out.println("Ingrese categoría: ");
                    String categoria = leer.nextLine();
                    habitacion = new HabitacionSimple(numero, precio, capacidad, categoria);
                    break;
                case "Doble":
                    System.out.println("Ingrese dimension: ");
                    String vista = leer.nextLine();
                    leer.nextLine();
                    habitacion = new HabitacionDoble(numero, precio, capacidad, vista);
                    break;
                case "Suite":
                    System.out.println("Ingrese servicioAdicional: ");
                    String servicioAdicional = leer.nextLine();
                    habitacion = new Suite(numero, precio, capacidad, servicioAdicional);
                    break;
            }
        return habitacion;
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        try {
            Habitacion simple = pedirDatos("Simple");
            hotel.agregarHabitacion(simple);
        } catch (InputMismatchException e) {
            System.out.println("Error de tipo de datos");
        } catch (Exception e) {
            System.out.println("Error general");
        } finally {
            System.out.println("En bloque finally");
        }

        try {
            Habitacion doble = pedirDatos("Doble");
            hotel.agregarHabitacion(doble);
        } catch (InputMismatchException e) {
            System.out.println("Error de tipo de datos");
        } catch (Exception e) {
            System.out.println("Error general");
        } finally {
            System.out.println("En bloque finally");
        }

        try {
            Habitacion suite = pedirDatos("Suite");
            hotel.agregarHabitacion(suite);
            Habitacion suite1 = new Suite(10,99,2,"desayuo");
            ((Suite)suite).calcularDescuento(0);

        } catch (InputMismatchException e) {
            System.out.println("Error de tipo de datos");
        } catch (Exception e) {
            System.out.println("Error general");
        } finally {
            System.out.println("En bloque finally");
        }

        System.out.println("Agregadas...");
        System.out.println("Mostrando...");
        hotel.mostrarDisponibles();

        System.out.println("Ordenando..");
        hotel.ordenarPorNumero();
        System.out.println("Mostrando ordenadas..");
        hotel.mostrarDisponibles();
    }
}

//        Habitacion habitacion_simple = new HabitacionSimple(0, 100, 2, "Simple");
//        Habitacion habitacion_doble = new HabitacionDoble(1, 200, 4, "Mar");
//        Habitacion suite = new Suite(2, 300, 6, "Bar");
//        Hotel hotel1 = new Hotel();
//
//        hotel1.agregarHabitacion(habitacion_doble);
//        hotel1.agregarHabitacion(habitacion_simple);
//        hotel1.agregarHabitacion(suite);
//
//        hotel1.mostrarDisponibles();
//        System.out.println("Ordenando.. ");
//        hotel1.ordenarPorNumero();
//
//        hotel1.mostrarDisponibles();
