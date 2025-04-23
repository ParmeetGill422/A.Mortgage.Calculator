import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Enter annual interest rate (e.g., 7.625): ");
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter loan principal ($): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter loan term (years): ");
        int years = scanner.nextInt();

        int n = years * 12; // total number of monthly payments
        double i = annualRate / 12; // monthly interest rate

        double monthlyPayment = principal * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        double totalInterest = (monthlyPayment * n) - principal;

        System.out.println("Monthly Payment: " + currency.format(monthlyPayment));
        System.out.println("Total Interest Paid: " + currency.format(totalInterest));

        if (totalInterest > principal) {
            System.out.printf("That's a " + currency.format(totalInterest) +"bonus gift to your mortgage company for the privilege of being in debt.\n", totalInterest);
            System.out.println("Congratulations, you're their favorite customer.\n That’s like paying for a second house... except you don’t get one.");
            System.out.println("I recommend downgrading Or should I just draft your letter to the bank that says 'WHY'?");
        }
    }
}
