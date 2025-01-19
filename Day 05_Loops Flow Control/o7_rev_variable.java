import java.util.Scanner;

public class o7_rev_variable {
    public static void main(String[] args) {
        Scanner User_input = new Scanner(System.in);
        System.out.print("Please enter Number: ");
        int num = User_input.nextInt();

        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);
        User_input.close();
    }
}
