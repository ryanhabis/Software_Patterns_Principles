package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private static TransactionManager instance;
    private final List<Transaction> transactions;
    private final List<Observer> observers;

    private TransactionManager() {
        transactions = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        notifyObservers();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
