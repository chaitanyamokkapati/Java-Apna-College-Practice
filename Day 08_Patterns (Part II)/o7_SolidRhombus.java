import java.util.Scanner;

public class o7_SolidRhombus {
    public static void sol_rhomb(int n) {
        // Outer
        for(int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //Stars
            for (int  j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        sol_rhomb(n);
        sc.close();
    }
}
