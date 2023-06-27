package guide5b_exercise4;

import java.time.LocalDate;
import java.util.LinkedList;

public class Account {

    private long number;
    private double balance;
    private double annual_interest;
    private Customer account_holder;
    private LinkedList<Movement> movements = new LinkedList<>();

    public Account(long number, Customer account_holder) {
        this.number = number;
        this.account_holder = account_holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
        Movement movement = new Movement(LocalDate.now(), 'D', amount, this.balance);
        this.movements.add(movement);
        System.out.println("Deposit movement: " + movement);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("You don't have enough money");
        }
        Movement movement = new Movement(LocalDate.now(), 'E', amount, this.balance);
        this.movements.add(movement);
        System.out.println("Withdraw movement: " + movement);
    }

    public void changeAnnualInterest(double value) {
        this.annual_interest = value;
    }

    public Customer seeAccountHolder() {
        return this.account_holder;
    }

    public double seeBalance() {
        return this.balance;
    }

    public void listMovements() {
        for (int i = 0; i < this.movements.size(); i++) {
            System.out.println("Movement " + i + ": "+ this.movements.get(i));
        }
    }

}
