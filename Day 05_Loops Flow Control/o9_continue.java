// Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class o9_continue {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);

        do{
            System.out.print("Enter number to check: ");
            int num = user_in.nextInt();

            if (num % 10 == 0) {
                continue;
            }
            System.out.println("The Number was : " + num);

        } while(true);
    }
}