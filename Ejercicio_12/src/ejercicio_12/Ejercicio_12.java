package ejercicio_12;

public class Ejercicio_12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Robot robot1=new Robot("Leandro");
        
        robot1.avanzar(5000);

        if(robot1.bateriaVacia()){
            System.out.println("Sin bateria");
        }
        
    }
    
}
//7) En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado
//en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su
//atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos
//adicionales:

// avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que
//por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería
//suficiente.

// bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor
//menor o igual a cero.

//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//a) Crear un objeto Robot de nombre “Tito”
//Luego utilizando sus métodos:
//b) Hacerlo avanzar de a un paso hasta que se quede sin batería.