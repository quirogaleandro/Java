package ejercicio_14;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esBisiesto() {
        if (this.año % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

//10 04 2022 Fecha que me pasaron
//20 04 2020 Fecha de la clase
    public int calcularAños(Fecha otraFecha) {
        int añosTranscurridos = otraFecha.año - this.año;
        if (otraFecha.mes < this.mes
                || (otraFecha.mes == this.mes && otraFecha.dia < this.dia)) {
            añosTranscurridos--;
        }
        return añosTranscurridos;
    }
}

//En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos: dia,
//mes, año; un constructor que permita inicializar a todos sus atributos; los métodos getter y
//setter para sus atributos y los siguientes métodos adicionales:
// esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario
//retornará false.
// calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que
//será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//a) Crear dos objetos de tipo fecha.
//Utilizando sus métodos:
//b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
//c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
