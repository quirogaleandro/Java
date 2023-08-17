package guide5b_exercise6;

public class Appliance extends Product {

    private double consumption_watts;

    public Appliance(int code, String description, String brand, double list_price, int stock, double consumption_watts) {
        super(code, description, brand, list_price, stock);
        this.consumption_watts = consumption_watts;
    }

    public double getConsumption_watts() {
        return consumption_watts;
    }

    public void setConsumption_watts(double consumption_watts) {
        this.consumption_watts = consumption_watts;
    }

    @Override
    public void calculatePublicPrice() {
        this.list_price = this.list_price * 1.25;
    }

    @Override
    public String toString() {
        return "Appliance{"
                + "code=" + this.code
                + ", description='" + this.description + '\''
                + ", brand='" + this.brand + '\''
                + ", list_price=" + this.list_price
                + ", stock=" + this.stock
                + ", consumption_watts='" + this.consumption_watts + '\''
                + '}';
    }

}
