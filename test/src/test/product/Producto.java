
package test.product;


public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    
    public Producto(int codigo, String descripcion, double precio, int stock){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
    }

    public Producto (){}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
