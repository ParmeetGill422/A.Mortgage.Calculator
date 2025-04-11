import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);

        if (totalInterest > principal) {
            System.out.printf("That's a $%.2f bonus gift to your mortgage company for the privilege of being in debt.\n", totalInterest);
            System.out.println("Congratulations, you're their favorite customer.\nThat’s like paying for a second house... except you don’t get one.");
            System.out.println("I recommend downgrading Or should I just draft your letter to the bank that says 'WHY'?");
        }
    }
}
