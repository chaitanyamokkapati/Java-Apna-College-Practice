// Ask user to inmput a and b values.

import java.util.Scanner;

public class o11_ProduxtOfAandBInput {
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
        int product = a * b;
        
        // Output the result
        System.out.println("The Product of a and b is: " + product);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
