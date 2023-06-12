package guia4_ejercicio2;

public class Guia4_Ejercicio2 {

    public static void main(String[] args) {
        Electrodomestico lavadora1=new Lavadora(10,"rojo",'B',20 );
        Electrodomestico television1=new Television(50,false,"blanco",'A',20 );
        
        lavadora1.precioFinal();
        television1.precioFinal();
    }

}
