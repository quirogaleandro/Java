package ejercicio_11;

public class Ejercicio_11 {

    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo figura1=new Triangulo(1,3,2);
        if(figura1.esUnTriangulo()){
            System.out.println("Es triangulo");
        }else{
            System.out.println("No es triangulo");
        }
        
        figura1.tipoTriangulo();
        
    }
    
}
