package guide5b_exercise6;

import java.util.Scanner;

public class Guide5B_Exercise6 {

    public static void main(String[] args) {

        Catalogue catalogue1 = new Catalogue();
        Clothes jeans = new Clothes(1, "Good jeans", "Lecop", 100, 4, "FabricOne");
        Clothes jeans1 = new Clothes(2, "Good jeans", "Tiras", 100, 4, "FabricOne");
        Clothes jeans2 = new Clothes(3, "Good jeans", "Lemon", 100, 4, "FabricTwo");

        Perfume saphirus = new Perfume(3, "Good Perfume", "saphirus", 200, 1, 300);
        Appliance tv = new Appliance(6, "Good TV", "Samsung", 1000, 2, 100);

        catalogue1.addProduct("Clothes", jeans);
        catalogue1.addProduct("Clothes", jeans1);
        catalogue1.addProduct("Clothes", jeans2);

        catalogue1.addProduct("Perfume", saphirus);
        catalogue1.addProduct("Appliance", tv);

        catalogue1.listClothes();
        catalogue1.listPerfume();
        catalogue1.listAppliances();

        catalogue1.listProductsAmount();

    }

}
