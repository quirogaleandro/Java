package guide5b_exercise4;

import java.time.LocalDate;

public class Customer {

    private String name;
    private String last_name;
    private String location;
    private LocalDate birth;

    public Customer(String name, String last_name, String location, LocalDate birth) {
        this.name = name;
        this.last_name = last_name;
        this.location = location;
        this.birth = birth;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "name='" + name + '\''
                + ", last_name='" + last_name + '\''
                + ", location='" + location + '\''
                + ", birth=" + birth
                + '}';
    }
}
