package ejercicio_5;
import ejercicio_5.Pieza;
        
public class Ejercicio_5 {

    public static void main(String[] args) {
        Pieza peon=new Pieza("Peon","Vertical","Diagonal",1,"Negro");
        
        System.out.println("Nombre: "+peon.getNombre());
        System.out.println("Movimiento: "+peon.getMovimiento());
        System.out.println("Movimiento al comer: "+peon.getMovimiento_al_comer());
        System.out.println("Valor: "+peon.getValor());
        System.out.println("Color: "+peon.getColor());
    }
    
}
