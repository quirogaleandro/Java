package guide5b_exercise4;

import java.time.LocalDate;

public class Guide5B_Exercise4 {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
        Account account1 = new Account( 1234, customer1);
        
        account1.deposit(60000);
        account1.withdraw(10000);
        System.out.println(account1.seeBalance());
        System.out.println(account1.seeAccountHolder());
        account1.listMovements();
    }

}
