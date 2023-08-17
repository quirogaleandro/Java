package guide5b_exercise6;

public class Perfume extends Product {

    private double size_in_cc;

    public Perfume(int code, String description, String brand, double list_price, int stock, double size_in_cc) {
        super(code, description, brand, list_price, stock);
        this.size_in_cc = size_in_cc;
    }

    @Override
    public void calculatePublicPrice() {
        double increase_cc = size_in_cc / 100;
        double increase = 0.2 * increase_cc;
        this.list_price = this.list_price + (1 + increase);
    }

    @Override
    public String toString() {
        return "Perfume{"
                + "code=" + this.code
                + ", description='" + this.description + '\''
                + ", brand='" + this.brand + '\''
                + ", list_price=" + this.list_price
                + ", stock=" + this.stock
                + ", size in cc='" + this.size_in_cc + '\''
                + '}';
    }

}
