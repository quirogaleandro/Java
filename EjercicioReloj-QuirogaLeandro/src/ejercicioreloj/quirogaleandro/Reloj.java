package ejercicioreloj.quirogaleandro;

public class Reloj {
    private String dia;
    private String hora;
    private String modelo;
    private long numserie;

    public Reloj(String dia, String hora, String modelo, long numserie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numserie = numserie;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    public void incrementarDia(){}
    public void incrementarHora(){}
    public void limpiarPantalla(){}
    
    
    
}
