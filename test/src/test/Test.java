package test;

import test.product.Producto;

public class Test {

    public static void main(String[] args) {
        Producto product=new Producto(23,"Barato",3.40,6);
        System.out.println(product.getCodigo());
        System.out.println(product.getStock());
        System.out.println(product.getPrecio());
        System.out.println(product.getDescripcion());
    }
    
}
