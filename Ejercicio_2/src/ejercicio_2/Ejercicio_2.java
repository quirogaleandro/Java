package ejercicio_2;
import ejercicio_2.Computadora.Computadora;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Computadora pc=new Computadora(3,1,256,"Samsung",249.99);
        System.out.println(pc.getAlmacenamiento()+" GB");
        System.out.println(pc.getCPU()+" CPU");
        System.out.println(pc.getMemoria()+" GB");
        System.out.println(pc.getMarca());
        System.out.println("$"+pc.getPrecio());
    }
    
}
