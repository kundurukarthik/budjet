import java.util.Scanner;

public class BudgetTrackerApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BudgetTracker budgetTracker = new BudgetTracker();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPersonal Budget Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    budgetTracker.viewExpenses();
                    break;
                case 3:
                    System.out.printf("Total Expenses: $%.2f\n", budgetTracker.getTotalExpenses());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void addExpense() {
        System.out.print("Enter expense amount: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();

        budgetTracker.addExpense(amount, description);
        System.out.println("Expense added successfully.");
    }
}
