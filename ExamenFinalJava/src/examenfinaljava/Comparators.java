/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaljava;

/**
 *
 * @author Usuario}
 */
public class Comparators {

    public static java.util.Comparator<Habitacion> sortByLastName = new java.util.Comparator<Habitacion>() {
        @Override
        public int compare(Habitacion o1, Habitacion o2) {
            return o1.getNumero().compareTo(o2.getNumero());
        }
    };

}
