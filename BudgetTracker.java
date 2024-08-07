import java.util.ArrayList;
import java.util.List;

public class BudgetTracker {
    private List<Expense> expenses;

    public BudgetTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(double amount, String description) {
        expenses.add(new Expense(amount, description));
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("Expenses:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}
