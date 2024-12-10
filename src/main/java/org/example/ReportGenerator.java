package org.example;

public class ReportGenerator implements Observer {
    private final TransactionManager manager;

    public ReportGenerator(TransactionManager manager) {
        this.manager = manager;
    }

    @Override
    public void update() {
        System.out.println("\nReport Updated:");
        generateReport();
    }

    public void generateReport() {
        double totalIncome = 0;
        double totalExpense = 0;

        for (Transaction transaction : manager.getTransactions()) {
            if (transaction instanceof Income) {
                totalIncome += transaction.getAmount();
            } else if (transaction instanceof Expense) {
                totalExpense += transaction.getAmount();
            }
        }

        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Balance: " + (totalIncome - totalExpense) + "\n");
    }
}
