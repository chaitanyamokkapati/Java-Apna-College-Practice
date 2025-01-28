import java.util.Scanner;

public class o11_DecToBin {

    // Method to convert decimal to binary
    public static void decToBin(int userInput) {
        int binary = 0;
        int pow = 0;
        int MyNum = userInput;
        
        // Convert decimal to binary
        while (userInput > 0) {
            int remainder = userInput % 2;
            binary = binary + (remainder *(int)Math.pow(10, pow));  // Append the binary digit
            pow++;  // Increment the power of 10
            userInput = userInput / 2;  // Divide the number by 2
        }
        
        System.out.println("The binary form of " + MyNum + " is = "  + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Please enter a decimal number: ");
        int userInput = sc.nextInt();
        
        // Call the method to convert and display the binary form
        decToBin(userInput);
        
        sc.close();  // Close the scanner
    }
}
