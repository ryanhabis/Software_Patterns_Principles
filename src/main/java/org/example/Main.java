package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransactionManager manager = TransactionManager.getInstance();
        ReportGenerator reportGenerator = new ReportGenerator(manager);
        manager.addObserver(reportGenerator);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPersonal Finance Tracker");
            System.out.println("1. Add a Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter transaction type (income/expense): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    Transaction transaction = TransactionFactory.createTransaction(type, amount, category);
                    manager.addTransaction(transaction);
                    System.out.println("Transaction added successfully!");
                }
                case 2 -> {
                    System.out.println("\nAll Transactions:");
                    for (Transaction transaction : manager.getTransactions()) {
                        transaction.displayDetails();
                    }
                }
                case 3 -> reportGenerator.generateReport();
                case 4 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Exiting Personal Finance Tracker. Goodbye!");
    }
}
