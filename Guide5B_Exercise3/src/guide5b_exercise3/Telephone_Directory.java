package guide5b_exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephone_Directory {

    private HashMap<Integer, Customer> directory = new HashMap<Integer, Customer>();

    public Telephone_Directory() {
    }

    public void addCustomer(int telephone_number, Customer customer) {
        this.directory.put(telephone_number, customer);
    }

    public Customer searchCustomer(int telephone_number) {
        try {
            for (Map.Entry<Integer, Customer> entry : directory.entrySet()) {
                Integer key = entry.getKey();
                Customer value = entry.getValue();

                if (key == telephone_number) {
                    return value;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List searchTelephone(String last_name) {
        List<Integer> telephone_numbers = new ArrayList<>();  
        for (Map.Entry<Integer, Customer> entry : directory.entrySet()) {
            Integer key = entry.getKey();
            Customer value = entry.getValue();
            
            if(value.getLast_name() == last_name){
                telephone_numbers.add(key);
            }
        }
        return telephone_numbers;
    }

    public List searchCustomers(String city) {
        List<Customer> customers = new ArrayList<>();  
        
        for (Map.Entry<Integer, Customer> entry : directory.entrySet()) {
            Integer key = entry.getKey();
            Customer value = entry.getValue();
            
            if(city == value.getCity()){
                customers.add(value);
            }
        }
        return customers;
    }

    public void deleteCustomer(int telephone_number) {
        for (Map.Entry<Integer, Customer> entry : directory.entrySet()) {
            Integer key = entry.getKey();
            
            if(telephone_number == key){
                directory.remove(key);
            }
            
        }
    }

}
