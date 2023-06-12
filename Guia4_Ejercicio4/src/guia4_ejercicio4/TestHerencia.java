package guia4_ejercicio4;

public class TestHerencia {

    public static void main(String[] args) {
        Position position_guerrero1 = new Position(100, 200);
        Personaje guerrero1 = new Guerrero(true, position_guerrero1, "Thor");

        guerrero1.TurnTo();
        guerrero1.TurnTo();
        guerrero1.TurnTo();
        guerrero1.Advance();
        guerrero1.Advance();
        guerrero1.Advance();
        guerrero1.Advance();
        guerrero1.Advance();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Shoot();
        guerrero1.Advance();

    }

}
