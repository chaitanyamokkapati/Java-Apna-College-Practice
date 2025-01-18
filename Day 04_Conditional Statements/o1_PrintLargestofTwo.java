// Largest of Two Numbers

import java.util.Scanner;

public class o1_PrintLargestofTwo {
    public static void main(String[] args) {
        Scanner input_user = new Scanner(System.in);
        System.out.print("Please Give a: ");
        int a = input_user.nextInt();
        System.out.print("Please Give b: ");
        int b = input_user.nextInt();

        if (a == b) {
            System.out.println("A is Equal to B");
        }
        else if (a >= b) {
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is Greater");
        }
    input_user.close();
    }
}
