# **Personal Finance Tracker**

A simple, text-based Java application designed to help users track income and expenses. The project demonstrates the use of **four Gang of Four (GoF) design patterns**: **Factory Method**, **Singleton**, **Observer**, and **Decorator**.

---

## **Features**

- Add transactions as **Income** or **Expense** with an amount, category, and label.
- View all transactions in a formatted list.
- Generate reports showing:
  - Total Income
  - Total Expenses
  - Current Balance
- Mark expenses as **tax-deductible**, dynamically adding tax-related calculations using the Decorator pattern.

---

## **Design Patterns**

| **Pattern**        | **Purpose**                                           | **Implementation**                                                   |
|---------------------|-------------------------------------------------------|-----------------------------------------------------------------------|
| **Factory Method**  | Simplifies object creation for transactions.          | `TransactionFactory` creates `Income` or `Expense`.                  |
| **Singleton**       | Manages a single instance of transaction data.        | `TransactionManager` ensures consistent access to transactions.       |
| **Observer**        | Automatically updates the report on data changes.     | `TransactionManager` notifies `ReportGenerator`.                     |
| **Decorator**       | Dynamically adds behavior to transactions.            | `TransactionDecorator` and `TaxDeductibleDecorator` enhance expenses. |

---

## **Pros and Cons of Design Patterns**

### **Factory Method**
- **Pros**:
  - Clean and centralized object creation.
  - Easy to add new transaction types.
- **Cons**:
  - Adds overhead for simple systems.
  - Dependence on the factory class.

### **Singleton**
- **Pros**:
  - Centralized transaction management.
  - Ensures consistent access to data.
- **Cons**:
  - Hidden dependencies can make testing harder.
  - Overuse may lead to tight coupling.

### **Observer**
- **Pros**:
  - Automatically updates reports.
  - Decouples reporting logic from transaction management.
  - Scalable with additional observers.
- **Cons**:
  - Managing multiple observers can become complex.
  - Performance may degrade with frequent updates.

### **Decorator**
- **Pros**:
  - Flexible and reusable extensions for transactions.
  - Preserves Open/Closed Principle.
- **Cons**:
  - Can increase complexity with excessive wrapping.
  - Multiple layers may reduce efficiency.

---

## **How to Run**

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/personal-finance-tracker.git
   cd personal-finance-tracker
   ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Compile and run the `Main` class.

---

## **Example Usage**

### **Adding Transactions**
```
Enter transaction type (income/expense): income
Enter amount: 1500
Enter category: Salary
Enter a label for this transaction: Monthly Salary
Transaction added successfully!
```

### **Marking an Expense as Tax-Deductible**
```
Enter the index of the expense to mark as tax-deductible (starting from 0): 0
Enter tax rate (e.g., 0.10 for 10%): 0.10
Expense marked as tax-deductible successfully!
```

### **Viewing Transactions**
```
All Transactions:
Income - Label: Monthly Salary, Amount: 1500.0, Category: Salary
Expense - Label: Grocery Shopping, Amount: 200.0, Category: Groceries
```

### **Generating Report**
```
Total Income: 1500.0
Total Expense: 200.0
Balance: 1300.0
```

---

## **Future Enhancements**

- Add support for additional transaction types (e.g., loans, investments).
- Enable file-based persistence for transactions to allow saving and loading data.
- Implement sorting and filtering options for transaction lists.
- Extend tax deduction rules to support more dynamic calculations.
