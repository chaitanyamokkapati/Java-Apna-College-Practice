// Ask user to inmput a and b values.

import java.util.Scanner;

public class o10_SumOfAandBInput {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input value for 'a'
        System.out.println("Input a value: ");
        int a = sc.nextInt();
        
        // Ask the user to input value for 'b'
        System.out.println("Input b value: ");
        int b = sc.nextInt();
        
        // Calculate the sum of 'a' and 'b'
        int sum = a + b;
        
        // Output the result
        System.out.println("The sum of a and b is: " + sum);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
