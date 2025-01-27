import java.util.Scanner;

public class o7_Binomial_Coefficient {

    // Method to calculate factorial
    public static int Fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to calculate binomial coefficient
    public static void bin_cof(int n, int r) {
        // Checking if r is greater than n
        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
            return;
        }

        // Calculate factorial of n, r, and (n - r)
        int n_fact = Fact(n);
        int r_fact = Fact(r);
        int n_minus_r_fact = Fact(n - r);

        // Calculate binomial coefficient
        int binomialCoefficient = n_fact / (r_fact * n_minus_r_fact);

        // Print result
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") = " + binomialCoefficient);
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for 'n' and 'r'
        System.out.println("Please enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Please enter the value of r: ");
        int r = sc.nextInt();

        // Call the method to calculate binomial coefficient
        bin_cof(n, r);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
