package org.example;

public class SavingAccount {
    double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawing $" + amount);
            //System.out.println("Balance is $" + balance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited $" + amount);
        System.out.println("Balance is $" + balance);
    }
    public double displayBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}
