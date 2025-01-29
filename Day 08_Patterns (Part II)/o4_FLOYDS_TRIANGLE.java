import java.util.Scanner;

public class o4_FLOYDS_TRIANGLE {
    public static void FLOYDS_TRIANGLE(int n) {
        int counter = 1;
        // Outer loop
        for(int i = 1; i <= n; i++){
            //Inner Loop
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input Number : ");
        int n = sc.nextInt();
        FLOYDS_TRIANGLE(n);
        sc.close();
    }
}
