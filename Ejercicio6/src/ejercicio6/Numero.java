/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

public class Numero {
    private int num;
    
    Numero(int num){
        this.num=num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public boolean esPar(){
        if(this.num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esPositivo(){
        if(this.num >= 0){
            return true;
        }else{
            return false;
        }
    }    
    
    public boolean esMultiploDe(int valor){
        if(valor % this.num == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
