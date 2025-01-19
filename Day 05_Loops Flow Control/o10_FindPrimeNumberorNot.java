// Prime or Not
// Property : n = a * b ==> multiple of 1 and itself

import java.util.*;

public class o10_FindPrimeNumberorNot {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.println("Please Enter Number to Check : ");
        int num = user_in.nextInt();

        if (num == 2) {
            System.out.print(num + " is Prime Number.");;
        }
        else{
            boolean isprime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                /*for(int i = 2; i <= num - 1; i++){*/
                if (num % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.println( num + " is Prime Number.");
            }
            else{
                System.out.println( num + " is Not a Prime Number.");
            }
        }
        user_in.close();
    }
}
