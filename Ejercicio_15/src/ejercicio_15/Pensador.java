package ejercicio_15;

public class Pensador {

    private int entero;

    public Pensador(int entero) {
        this.entero = entero;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int invertir() {
        int resto;
        int invertido = 0;

        while (this.entero > 0) {
            resto = this.entero % 10;
            //resto=primer numero de la derecha
            invertido = invertido * 10 + resto;
            //Invertido= va ordenando el numero invertido
            this.entero = this.entero / 10;
            //this.entero=va comiendo un digito
        }
        return invertido;
    }

    public int parAntes() {
        int par_anterior = this.entero - 1;
        if (par_anterior % 2 != 0) {
            par_anterior--;
            //this.entero = 23
            //parAnterior=22
            //Si no es par restale uno y retornalo.
            //Si el numero es par, no entra en el if y lo retorna
        }
        return par_anterior;
    }

    public int parPosterior() {
        int par_posterior = this.entero + 1;
        if (par_posterior % 2 != 0) {
            par_posterior++;
            //this.entero = 23
            //parAnterior=22
            //Si no es par restale uno y retornalo.
            //Si el numero es par, no entra en el if y lo retorna
        }
        return par_posterior;
    }

    public int primerDigito() {
        while (this.entero >= 10) {
            this.entero = this.entero / 10;
        }
        return this.entero;
    }

    public int ultimoDigito() {
        return this.entero % 10;
    }

}
