package guia3_ejercicio3;

public class Auto {

    private String color;
    private String patente;
    private double combustible = 50;
    private int metros_recorridos = 0;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;

    public Auto(String color, String patente, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
        this.color = color;
        this.patente = patente;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }

    public void avanzar(int metros) {
        if (rueda1.getPresion() < 1 || rueda2.getPresion() < 1 || rueda3.getPresion() < 1 || rueda4.getPresion() < 1) {
            System.out.println("No puede avanzar porque tiene una rueda pinchada");
        } else {
            if (metros < 0) {
                System.out.println("La cantidad de metros debe ser mayor a cero");
            }
            if (this.combustible < 1) {
                System.out.println("No hay mas combustible");
            } else {
                int litros_gastados = metros / 10;

                if (this.combustible >= litros_gastados) {
                    this.combustible = this.combustible - litros_gastados;
                    System.out.println("Ha avanzado " + metros + " metros");
                    System.out.println("Combustible " + this.combustible);
                } else {
                    System.out.println("No hay mas combustible");
                }
            }
        }

    }

    public void retroceder(int metros) {
        if (rueda1.getPresion() < 0 || rueda2.getPresion() < 0 || rueda3.getPresion() < 0 || rueda4.getPresion() < 0) {
            System.out.println("No puede avanzar porque tiene una rueda pinchada");
        } else {
            if (metros < 0) {
                System.out.println("La cantidad de metros debe ser mayor a cero");
            }
            if (this.combustible < 1) {
                System.out.println("No hay mas combustible");
            } else {
                int litros_gastados = metros / 10;

                if (this.combustible >= litros_gastados) {
                    this.combustible = this.combustible - litros_gastados;
                    System.out.println("Ha retrocedido " + metros + " metros");
                    System.out.println("Combustible " + this.combustible);
                } else {
                    System.out.println("No hay mas combustible");
                }
            }
        }
    }

    public void llenarTanque() {
        this.combustible = 50;
        System.out.println("Tanque lleno("+(int)this.combustible+" lts)");
    }

}
