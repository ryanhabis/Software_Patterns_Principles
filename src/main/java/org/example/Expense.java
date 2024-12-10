package org.example;

public class Expense extends Transaction {
    public Expense(double amount, String category) {
        super(amount, category);
    }

    @Override
    public void displayDetails() {
        System.out.println("Expense - Amount: " + amount + ", Category: " + category);
    }
}
