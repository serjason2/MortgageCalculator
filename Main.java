import java.util.Scanner;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Avoid magic numbers, and always use constant and final variables to describe them
        final byte MONTHS_IN_YEAR = 12; // 12 months = 1 year
        final byte PERCENT = 100; // 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: "); // int
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: "); // float
        float annualInterest = scanner.nextFloat();
        float monthlyInterst = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                        * (monthlyInterst * Math.pow(1 + monthlyInterst, numberOfPayments))
                        / (Math.pow(1 + monthlyInterst, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}