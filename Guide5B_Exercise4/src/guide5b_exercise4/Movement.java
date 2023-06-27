package guide5b_exercise4;

import java.time.LocalDate;

public class Movement {

    private LocalDate date;
    private char type;
    private double amount;
    private double balance;

    public Movement(LocalDate date, char type, double amount, double balance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction{"
                + "date=" + date
                + ", type=" + type
                + ", amount=" + amount
                + ", balance=" + balance
                + '}';
    }

}
