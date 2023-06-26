package guide5b_exercise3;

public class Customer {

    private int dni;
    private String name;
    private String last_name;
    private String city;
    private String direction;

    public Customer(int dni, String name, String last_name, String city, String direction) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.city = city;
        this.direction = direction;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Apellido: " + last_name + ", City: " + city + " Direction: " + direction;
    }
}
