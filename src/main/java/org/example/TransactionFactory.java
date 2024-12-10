package org.example;

public class TransactionFactory {
    public static Transaction createTransaction(String type, double amount, String category) {
        if ("income".equalsIgnoreCase(type)) {
            return new Income(amount, category);
        } else if ("expense".equalsIgnoreCase(type)) {
            return new Expense(amount, category);
        } else {
            throw new IllegalArgumentException("Invalid transaction type: " + type);
        }
    }
}
