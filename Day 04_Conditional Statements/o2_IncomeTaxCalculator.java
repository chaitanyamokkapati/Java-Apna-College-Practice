import java.util.Scanner;

public class o2_IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        int income_user = user_input.nextInt();
        int tax ;

        if (income_user < 500000) {
            tax = 0;
        }
        else if (income_user >= 500000 && income_user >= 1000000) {
            tax = (int) (income_user * 0.2);
        }
        else{
            tax = (int) (income_user * 0.3);
        }

        System.out.println("Your tax is : " + tax + ".");
        user_input.close();
    }
    
}
