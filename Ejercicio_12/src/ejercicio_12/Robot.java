package ejercicio_12;

public class Robot {
    private int bateria=500;
    private String nombre;
    private int pasos_recorridos=0;
    
    public Robot(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
 
    public void avanzar(int pasos){
        //cada 100 pasos consume 10 de bateria
        //solo avanza si hay bateria
        
        if(pasos > 0 && this.bateria > 0 && this.pasos_recorridos <= 5000){
            this.pasos_recorridos = this.pasos_recorridos + pasos;//Guarda la cantidad de pasos recorridos hasta el momento
            System.out.println("Pasos recorridos hasta el momento: "+this.pasos_recorridos );
        }else{
            System.out.println("Número invalido");
        }
        
        if(this.pasos_recorridos % 100 == 0 && this.bateria > 0){
                int num=pasos / 100;// Si los pasos recorridos son 100 200 300 400 500.
                this.bateria=this.bateria - (10 * num);//Hace la resta - 10 multiplicando
                //Si me ingresan 400 pasos seria = 500 = 500 - (40)
                //Si me ingresan 600 no va a ejecutar porque el maximo es de 500
        }
    }
    public boolean bateriaVacia(){
        if(this.bateria <= 0){
            return true;
        }else{
            System.out.println("bateria: "+this.bateria);
            return false;
        }
    }
}
