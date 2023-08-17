package guide5b_exercise6;

public class Clothes extends Product {

    private String type_of_fabric;

    public Clothes(int code, String description, String brand, double list_price, int stock, String type_of_fabric) {
        super(code, description, brand, list_price, stock);
        this.type_of_fabric = type_of_fabric;
    }

    public String getType_of_fabric() {
        return type_of_fabric;
    }

    public void setType_of_fabric(String type_of_fabric) {
        this.type_of_fabric = type_of_fabric;
    }

    @Override
    public void calculatePublicPrice() {
        this.list_price = this.list_price * 1.4;
    }

    @Override
    public String toString() {
        return "Clothes{"
                + "code=" + this.code
                + ", description='" + this.description + '\''
                + ", brand='" + this.brand + '\''
                + ", list_price=" + this.list_price
                + ", stock=" + this.stock
                + ", type_of_fabric='" + type_of_fabric + '\''
                + '}';
    }

}
