package guia4_ejercicio4;

public abstract class Personaje {

    protected Position location;
    protected String nick;
    protected int lives = 3;
    public int energy = 100;
    protected char orientation = 'N';

    public Personaje(Position location, String nick) {
        this.location = location;
        this.nick = nick;
    }

    public void Shoot() {
        if (this.energy > 9) {
            this.energy = this.energy - 10;
        } else {
            System.out.println("No tienes suficiente energia");
        }
        System.out.println("Energia: " + this.energy);
    }

    public void TurnTo() {
        switch (this.orientation) {
            case 'N':
                this.orientation = 'E';
                System.out.println("Girando del Norte al Este");
                break;
            case 'E':
                this.orientation = 'S';
                System.out.println("Girando del Este al Sur");
                break;
            case 'S':
                this.orientation = 'O';
                System.out.println("Girando del Sur al Oeste");
                break;
            case 'O':
                this.orientation = 'N';
                System.out.println("Girando del Oeste al Norte");
                break;
            default:
                // Manejar caso de orientación inválida aquí
                System.out.println("Orientación inválida");
                break;
        }
    }

    public void Advance() {
        int x = this.location.getX();
        int y = this.location.getY();

        switch (this.orientation) {
            case 'N':
                this.location.setY(y + 1);
                break;
            case 'E':
                this.location.setX(x + 1);
                break;
            case 'S':
                this.location.setY(y - 1);
                break;
            case 'O':
                this.location.setX(x - 1);
                break;
            default:
                // Manejar caso de orientación inválida aquí

                break;
        }
        System.out.println("pasos X: " + this.location.getX());
        System.out.println("pasos Y: " + this.location.getY());
    }

}
