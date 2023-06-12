package guia4_ejercicio4;

public class Guerrero extends Personaje {

    protected boolean horse;

    public Guerrero(boolean horse, Position location, String nick) {
        super(location, nick);
        this.horse = horse;
    }


    public void Shoot() {
        super.Shoot();
        if (this.energy < 30) {
            this.horse = false;
        }
    }
    
    public void Advance() {
        super.Advance();
        if (horse) {
            System.out.println("Tengo caballo");
            int x = this.location.getX();
            int y = this.location.getY();
            switch (this.orientation) {
                case 'N':
                    this.location.setY(y + 9);
                    break;
                case 'E':
                    this.location.setX(x + 9);
                    break;
                case 'S':
                    this.location.setY(y - 9);
                    break;
                case 'O':
                    this.location.setX(x - 9);
                    break;
                default:
                    // Manejar caso de orientación inválida aquí
                    break;
            }
        }
    }
}
