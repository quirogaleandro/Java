package guide5b_exercise6;

import java.util.HashSet;

public class Catalogue {

    private HashSet<Product> clothes = new HashSet<>();
    private HashSet<Product> electrical_appliances = new HashSet<>();
    private HashSet<Product> perfume = new HashSet<>();

    public Catalogue() {
    }

    public void addProduct(String type_of_product, Product product) {
        switch (type_of_product) {
            case "Clothes":
                clothes.add(product);
                break;
            case "Appliance":
                electrical_appliances.add(product);
                break;
            case "Perfume":
                perfume.add(product);
                break;
        }
    }

    public void listClothes() {
        for (Product clothe : clothes) {
            System.out.println(clothe);
        }
    }

    public void listPerfume() {
        for (Product perfume : perfume) {
            System.out.println(perfume);
        }
    }

    public void listAppliances() {
        for (Product apliance : electrical_appliances) {
            System.out.println(apliance);
        }
    }

    private int productsAmount(HashSet<Product> products) {
        int sum = 0;
        for (Product clothe : products) {
            int stock = clothe.stock;
            sum += stock;
        }
        return sum;
    }

    public void listProductsAmount() {
        System.out.println("");
        int clothes_amount = productsAmount(this.clothes);
        int appliances_amount = productsAmount(this.electrical_appliances);
        int perfume_amount = productsAmount(this.perfume);

        System.out.println("clothes amount: " + clothes_amount);
        System.out.println("appliances amount: " + appliances_amount);
        System.out.println("perfume amounts: " + perfume_amount);
        System.out.println("");
        int sum = clothes_amount + appliances_amount + perfume_amount;
        System.out.println("Total amount: " + sum);
    }

}
