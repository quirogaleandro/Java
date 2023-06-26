
import guide5b_exercise3.Customer;
import guide5b_exercise3.Telephone_Directory;

public class Guide5B_Exercise3 {

    public static void main(String[] args) {
        Customer customer1 = new Customer(43551310, "Leandro", "Quiroga", "San Luis", "York 345");
        Customer customer2 = new Customer(4341110, "Agustin", "Lopez", "San Justo", "York 345");
        Customer customer3= new Customer(4000310,"Carmela","Lopez","San Miguel","York 345");
        Customer customer4= new Customer(42647,"Fer","Quintana","San Luis","York 345");
        Customer customer5= new Customer(1457567,"Chancho","Quiroga","San Justo","York 345");

        Telephone_Directory directory = new Telephone_Directory();
        
        directory.addCustomer(2657, customer1);
        directory.addCustomer(111, customer2);
        directory.addCustomer(222, customer3);
        directory.addCustomer(333, customer4);
        directory.addCustomer(4444, customer5);
        
        System.out.println(directory.searchCustomer(2657));
        System.out.println(directory.searchTelephone("Quiroga"));
        System.out.println(directory.searchCustomers("San Luis"));
        directory.deleteCustomer(111);
        System.out.println(directory.searchCustomer(111));
    }

}
