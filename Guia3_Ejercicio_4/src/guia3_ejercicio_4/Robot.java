package guia3_ejercicio_4;

public class Robot {

    private Bateria bateria_original = new Bateria(1000);
    private boolean interactuar = true;

    public void Avanzar(int pasos) {
        if (this.interactuar) {
            if (pasos < 0 || pasos > 10000) {
                System.out.println("El número de pasos es incorrecto");
            } else {
                double cantidad_pasos = pasos / 10;
                System.out.println("Avanzando..");
                double resultado_carga = this.bateria_original.getCarga() - cantidad_pasos;
                this.bateria_original.setCarga(resultado_carga);
            }

            System.out.println("BATERIA: " + this.bateria_original.getCarga());
        } else {
            System.out.println("El robot esta durmiendo");
        }
    }

    public void Retroceder(int pasos) {
        if (this.interactuar) {
            if (pasos < 0 || pasos > 10000) {
                System.out.println("El número de pasos es incorrecto");
            } else {
                double cantidad_pasos = pasos / 10;
                System.out.println("Retrocediendo..");
                double resultado_carga = this.bateria_original.getCarga() - cantidad_pasos;
                this.bateria_original.setCarga(resultado_carga);
            }

            System.out.println("BATERIA: " + this.bateria_original.getCarga());
        } else {
            System.out.println("El robot esta durmiendo");
        }
    }

    public void Dormir() {
        System.out.println("Durmiendo..");
        this.interactuar = false;
    }

    public void Despertar() {
        System.out.println("Despertando..");
        this.interactuar = true;
    }

    public void Recargar() {
        System.out.println("Recargando..");
        this.bateria_original.setCarga(1000);
    }

    public boolean BateriaLlena() {
        if (this.bateria_original.getCarga() == 1000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean BateriaVacia() {
        if (this.bateria_original.getCarga() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double EnergiaActual(){
        return this.bateria_original.getCarga();
    }
    
}
