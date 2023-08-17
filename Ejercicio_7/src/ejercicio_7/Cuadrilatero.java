package ejercicio_7;

public class Cuadrilatero {
    private double largo;
    private double alto;
    
    public Cuadrilatero(double largo, double alto){
        this.largo=largo;
        this.alto=alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularPerimetro(){
        return (this.alto * 2) + (this.largo * 2);
    }
    
    public double calcularArea(){
        return this.alto * this.largo;
    }
    public boolean esUnCuadrado(){
        if(this.alto == this.largo){
            return true;
        }else{
            return false;
        }
    }
}
