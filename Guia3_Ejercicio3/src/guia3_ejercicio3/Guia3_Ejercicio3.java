package guia3_ejercicio3;

public class Guia3_Ejercicio3 {

    public static void main(String[] args) {
        Rueda rueda1=new Rueda("Sullivan");
        Rueda rueda2=new Rueda("Sullivan");
        Rueda rueda3=new Rueda("Sullivan");
        Rueda rueda4=new Rueda("Sullivan");
        Auto auto1=new Auto("Red","AZE 634",rueda1, rueda2, rueda3, rueda4);
        
        rueda1.inflar();
        rueda2.inflar();
        rueda3.inflar();
        rueda4.pinchar();
        
        auto1.avanzar(200);
        
        rueda4.inflar();
        
        auto1.avanzar(200);
        
        auto1.retroceder(100);
        
        
        auto1.llenarTanque();
    }
}
