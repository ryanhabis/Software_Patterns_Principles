package org.example;
public class Income extends Transaction {
    public Income(double amount, String category) {
        super(amount, category);
    }

    @Override
    public void displayDetails() {
        System.out.println("Income - Amount: " + amount + ", Category: " + category);
    }
}

