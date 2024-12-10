package org.example;

public abstract class TransactionDecorator extends Transaction {
    protected Transaction transaction;

    public TransactionDecorator(Transaction transaction) {
        super(transaction.getAmount(), transaction.getCategory());
        this.transaction = transaction;
    }

    @Override
    public abstract void displayDetails();
}
