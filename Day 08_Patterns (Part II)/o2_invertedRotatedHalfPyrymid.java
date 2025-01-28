import java.util.Scanner;

public class o2_invertedRotatedHalfPyrymid {
    public static void inv_half_pyrymid(int n) {
        //Outer
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                //Spaces
                System.out.print(" ");
            }
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert Number: ");
        int n = sc.nextInt();
        inv_half_pyrymid(n);
        sc.close();
    }
}
