package org.example;

public abstract class Transaction {
    protected double amount;
    protected String category;

    public Transaction(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public abstract void displayDetails();

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}
