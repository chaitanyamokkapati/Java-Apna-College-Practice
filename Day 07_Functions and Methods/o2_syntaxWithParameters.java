import java.util.Scanner;

public class o2_syntaxWithParameters {

    // Method to greet the user by name
    public static void Greet_user(String User_name) {
        System.out.println("Hello, " + User_name);
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner USERIN = new Scanner(System.in);
        
        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String User_name = USERIN.nextLine();
        
        // Call Greet_user with the input name
        Greet_user(User_name);
        
        // Close the scanner to prevent resource leak
        USERIN.close();
    }
}
