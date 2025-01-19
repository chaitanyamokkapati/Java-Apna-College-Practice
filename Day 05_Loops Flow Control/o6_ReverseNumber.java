import java.util.Scanner;

public class o6_ReverseNumber {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.println("Enter Number To Reverse : ");
        int number = user_in.nextInt();

        while (number > 0) {
            int last_digit = number % 10;
            System.out.print(last_digit + " ");
            number = number / 10;
        }
        user_in.close();
    }
}
