package guia3_ejercicio_4;

public class Hombre {

    public void jugarConRobot(Robot robot) {
        robot.Avanzar(500);
        robot.Retroceder(20);
        System.out.println("Bateria Actual" + robot.EnergiaActual());
        robot.Dormir();
    }

}
