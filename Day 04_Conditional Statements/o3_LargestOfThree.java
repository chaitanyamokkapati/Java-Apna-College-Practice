import java.util.Scanner;

public class o3_LargestOfThree {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = user_input.nextInt();
        System.out.print("Enter b: ");
        int b = user_input.nextInt();
        System.out.print("Enter c: ");
        int c = user_input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is Greater!!");
        }
        else if (b >= c) {
            System.out.println("B is Greater!!");
        }
        else{
            System.out.println("C is Greater!!");
        }
        user_input.close();
    }
}
