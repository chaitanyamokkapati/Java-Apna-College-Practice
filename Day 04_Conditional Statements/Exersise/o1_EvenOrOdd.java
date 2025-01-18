import java.util.Scanner;

public class o1_EvenOrOdd {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Input number want to check? ");
        int even_odd = user_input.nextInt();

        if (even_odd % 2 == 0) {
            System.out.println("Even");
        }
        else if (even_odd % 2 != 0) {
            System.out.println("odd!!");
        }
        else{
            System.out.println("input invalid");
        }
        user_input.close();
    }
}