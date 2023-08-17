package ejercicio_10;

public class Utilitario {
    
    static void dibujaCuadrado(int num){
        for(int i = 0; i < num; i = i + 1){
            for(int j = 0; j < num; j = j + 1){
                if(i==0 || i==num - 1 || j==0 || j==num - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    static int elMayorEs(int num1, int num2, int num3){
        if(num1 == num2){
            if(num1 == num3){
                System.out.println("Son iguales");
            }
        }
        if(num1 > num2){
            if(num1 > num3){
                return num1;
            }else{
                return num3;
            }
        }else{
            if(num2 > num3){
                return num2;
            }else{
                return num3;
            }
        }
    }
    
    static void elDiaEs(int num){
        switch(num){
            case 1: 
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Vienres");
                break;
            case 6: 
                System.out.println("Sábado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El dia no existe!!!");
        }
    }
    
}
