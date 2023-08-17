package guide5b_exercise6;

import java.util.Objects;

public abstract class Product {

    protected int code;
    protected String description;
    protected String brand;
    protected double list_price;
    protected int stock;

    public Product(int code, String description, String brand, double list_price, int stock) {
        this.code = code;
        this.description = description;
        this.brand = brand;
        this.list_price = list_price;
        this.stock = stock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.code != other.code) {
            return false;
        }
        if (Double.doubleToLongBits(this.list_price) != Double.doubleToLongBits(other.list_price)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

    public abstract void calculatePublicPrice();

}
