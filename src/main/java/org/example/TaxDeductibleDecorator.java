package org.example;

public class TaxDeductibleDecorator extends TransactionDecorator {
    public TaxDeductibleDecorator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public void displayDetails() {
        transaction.displayDetails();
        System.out.println("This expense is tax-deductible.");
    }
}
