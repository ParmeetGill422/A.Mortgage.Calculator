import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed annual interest rate
        double annualRate = 7.625 / 100;

        // Input values
        System.out.print("Enter loan principal ($): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter loan term (years): ");
        int years = scanner.nextInt();

        // Calculations
        int n = years * 12; // total number of monthly payments
        double i = annualRate / 12; // monthly interest rate

        double monthlyPayment = principal * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        double totalInterest = (monthlyPayment * n) - principal;

        // Output results
        System.out.printf("Using a fixed interest rate of 7.625%%\n");
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);

        // Bonus message
        if (totalInterest > principal) {
            System.out.printf("That's a $%.2f bonus gift to your mortgage company for the privilege of being in debt.\n", totalInterest);
            System.out.println("Congratulations, you're their favorite customer. They’re probably knitting you a sweater.");
        }
    }
}
