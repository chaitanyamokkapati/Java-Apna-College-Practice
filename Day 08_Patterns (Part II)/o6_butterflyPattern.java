import java.util.Scanner;

public class o6_butterflyPattern {
    public static void butterfly(int n) {
        for(int i = 1; i <= n; i++){
            //Stars i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            //Spaces 2 * (n - 1)
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            //Stars i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i = n; i >= 1; i--){
            //Stars i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            //Spaces 2 * (n - 1)
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            //Stars i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        butterfly(n);
        sc.close();
    }
}