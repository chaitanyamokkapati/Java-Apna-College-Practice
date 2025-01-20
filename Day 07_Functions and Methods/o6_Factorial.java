import java.util.Scanner;

public class o6_Factorial {
    public static int Fact(int n) {
        int fact = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("Step " + fact + " * " + i);
            fact = fact * i;
        }
        System.out.println("----------------------");

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int userInput = sc.nextInt();
        System.out.println("**********************");
        int result = Fact(userInput);
        System.out.println("Factorial of " + userInput + " is: " + result);
    }
}
